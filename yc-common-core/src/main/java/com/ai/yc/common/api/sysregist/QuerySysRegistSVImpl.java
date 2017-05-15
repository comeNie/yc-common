package com.ai.yc.common.api.sysregist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.api.sysregist.interfaces.IQuerySysRegistSV;
import com.ai.yc.common.api.sysregist.param.QuerySysRegistListRes;
import com.ai.yc.common.dao.mapper.bo.SysRegist;
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
public class QuerySysRegistSVImpl implements IQuerySysRegistSV {
	
	@Autowired
	private transient IQuerySysRegistBusiSV iQuerySysRegistBusiSV;

	@Override
	public QuerySysRegistListRes queryRegist() throws BusinessException, SystemException {
		QuerySysRegistListRes querySysRegistListRes = new QuerySysRegistListRes();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			SysRegist querySysRegist = iQuerySysRegistBusiSV.querySysRegist();
			BeanUtils.copyProperties(querySysRegistListRes, querySysRegist);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("优惠券模板查询成功");
            querySysRegistListRes.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            querySysRegistListRes.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("优惠券模板查询失败");
            querySysRegistListRes.setResponseHeader(responseHeader);
        }
		return querySysRegistListRes;
	}

	@Override
	public BaseResponse saveRegist(SaveSysBasic req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysRegistBusiSV.updateSysRegist(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("修改用途成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"修改用途失败");
		}
		return response;
	}

}
