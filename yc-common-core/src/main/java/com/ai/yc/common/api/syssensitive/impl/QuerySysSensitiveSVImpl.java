package com.ai.yc.common.api.syssensitive.impl;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.yc.common.api.syssensitive.interfaces.IQuerySysSensitiveSV;
import com.ai.yc.common.api.syssensitive.param.DeleteSysSensitive;
import com.ai.yc.common.api.syssensitive.param.SaveSysSensitive;
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
	private static final Logger logger = Logger.getLogger(QuerySysSensitiveSVImpl.class);
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
            responseHeader.setResultMessage("敏感词查询成功");
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("敏感词查询失败");
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }
		return sensitivePageQueryResponse;
	}


	@Override
	public BaseResponse saveSysSensitive(SaveSysSensitive req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysSensitiveBusiSV.saveSysSensitive(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("添加敏感词成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"添加敏感词失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysSensitive(DeleteSysSensitive param) throws BusinessException, SystemException {
		return iQuerySysSensitiveBusiSV.deleteSysSensitive(param.getId());
	}


	@Override
	public BaseResponse updateSysSensitive(SaveSysSensitive req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysSensitiveBusiSV.updateSysSensitive(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("修改敏感词成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"修改敏感词失败");
		}
		return response;
	}
}
