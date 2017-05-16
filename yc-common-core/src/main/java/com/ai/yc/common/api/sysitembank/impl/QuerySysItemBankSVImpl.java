package com.ai.yc.common.api.sysitembank.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.yc.common.api.sysitembank.interfaces.IQuerySysItemBankSV;
import com.ai.yc.common.api.sysitembank.param.DeleteSysItemBank;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryResponse;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageVo;
import com.ai.yc.common.api.sysitembank.param.SaveSysItemBank;
import com.ai.yc.common.service.business.sysitembank.IQuerySysItemBankBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 题库服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:28:30 
 * @version V1.0
 */
@Service
@Component
public class QuerySysItemBankSVImpl implements IQuerySysItemBankSV {
	
	@Autowired
	private transient IQuerySysItemBankBusiSV iQuerySysItemBankBusiSV;

	
	@Override
	public ItemBankPageQueryResponse queryItemBankPage(ItemBankPageQueryRequest param)
			throws BusinessException, SystemException {
		
		ItemBankPageQueryResponse itemBankPageQueryResponse = new ItemBankPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<ItemBankPageVo> pageInfo = iQuerySysItemBankBusiSV.queryItemBankPage(param);
            itemBankPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("题库列表查询成功");
            itemBankPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            itemBankPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("题库列表查询失败");
            itemBankPageQueryResponse.setResponseHeader(responseHeader);
        }
		return itemBankPageQueryResponse;
	}


	@Override
	public BaseResponse saveSysItemBank(SaveSysItemBank req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysItemBankBusiSV.saveSysItemBank(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("添加用途成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"添加用途失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysItemBank(DeleteSysItemBank param) throws BusinessException, SystemException {
		return iQuerySysItemBankBusiSV.deleteSysItemBank(param.getBid());
	}


	@Override
	public BaseResponse updateSysItemBank(SaveSysItemBank req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysItemBankBusiSV.updateSysItemBank(req);
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
