package com.ai.yc.common.api.sysbasic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysbasic.interfaces.IQuerySysBasicSV;
import com.ai.yc.common.api.sysbasic.param.QuerySysBasicJfRegistListRes;
import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.dao.mapper.bo.SysBasic;
import com.ai.yc.common.dao.mapper.bo.SysJf;
import com.ai.yc.common.dao.mapper.bo.SysRegist;
import com.ai.yc.common.service.business.sysbasic.IQuerySysBasicBusiSV;
import com.ai.yc.common.service.business.sysjf.IQuerySysJfBusiSV;
import com.ai.yc.common.service.business.sysregist.IQuerySysRegistBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 用途查询服务
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0
 */
@Service
@Component
public class QuerySysBasicSVImpl implements IQuerySysBasicSV {
	
	@Autowired
	private transient IQuerySysBasicBusiSV iQuerySysBasicBusiSV;
	
	@Autowired
	private transient IQuerySysJfBusiSV iQuerySysJfBusiSV;
	
	@Autowired
	private transient IQuerySysRegistBusiSV iQuerySysRegistBusiSV;

	@Override
	public BaseResponse saveBasic(SaveSysBasic req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysBasicBusiSV.updateSysBasic(req);
			iQuerySysJfBusiSV.updateSysJf(req);
			iQuerySysRegistBusiSV.updateSysRegist(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("保存基本设置成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"保存基本设置失败");
		}
		return response;
	}

	@Override
	public QuerySysBasicJfRegistListRes queryBasicJfRegist() throws BusinessException, SystemException {
		QuerySysBasicJfRegistListRes querySysBasicJfRegistListRes = new QuerySysBasicJfRegistListRes();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            SysBasic querySysBasic = iQuerySysBasicBusiSV.querySysBasic();
            SysJf querySysJf = iQuerySysJfBusiSV.querySysJf();
            SysRegist querySysRegist = iQuerySysRegistBusiSV.querySysRegist();
            BeanUtils.copyProperties(querySysBasicJfRegistListRes, querySysBasic);
            BeanUtils.copyProperties(querySysBasicJfRegistListRes, querySysJf);
            BeanUtils.copyProperties(querySysBasicJfRegistListRes, querySysRegist);
            
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("查询成功");
            querySysBasicJfRegistListRes.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            querySysBasicJfRegistListRes.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("查询失败");
            querySysBasicJfRegistListRes.setResponseHeader(responseHeader);
        }
		return querySysBasicJfRegistListRes;
	}

}
