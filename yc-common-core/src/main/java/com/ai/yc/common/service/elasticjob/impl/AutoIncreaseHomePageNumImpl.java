package com.ai.yc.common.service.elasticjob.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.yc.common.api.sysconfig.interfaces.ElasticJobSV;
import com.ai.yc.common.cache.HomeDataConfigCache;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.service.atom.sysconfig.ISysConfigAtomSV;
import com.alibaba.dubbo.config.annotation.Service;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2017年1月10日 下午3:13:51 
 * @version 
 * @since  
 */
@Service
@Component
public class AutoIncreaseHomePageNumImpl implements ElasticJobSV {

	@Autowired
	private transient ISysConfigAtomSV iSysConfigAtomSV;
	@Autowired
	private HomeDataConfigCache homeDataConfigCache;
	
	@Override
	public BaseResponse autoIncreaseHomeNum() throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iSysConfigAtomSV.changeOne();
			homeDataConfigCache.write();
			response.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
			//
			//
		} catch (BusinessException | SystemException e) {
			//
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			//
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
			responseHeader.setResultMessage("刷新首页指标数量失败");
			//
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}

}
