package com.ai.yc.common.api.syssensitive.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.yc.common.api.syssensitive.interfaces.IQuerySysSensitiveSV;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryResponse;
import com.ai.yc.common.api.syssensitive.param.SensitivePageVo;
import com.ai.yc.common.service.business.syssensitive.IQuerySysSensitiveBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
@Component
public class QuerySysSensitiveSVImpl implements IQuerySysSensitiveSV {
	
	@Autowired
	private transient IQuerySysSensitiveBusiSV iQuerySysSensitiveBusiSV;


	@Override
	public SensitivePageQueryResponse querySensitivePage(SensitivePageQueryRequest param)
			throws BusinessException, SystemException {
		
		SensitivePageQueryResponse sensitivePageQueryResponse = new SensitivePageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<SensitivePageVo> pageInfo = iQuerySysSensitiveBusiSV.querySensitivePage(param);
            sensitivePageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("题目查询成功");
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("题目查询失败");
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }
		return sensitivePageQueryResponse;
	}
}
