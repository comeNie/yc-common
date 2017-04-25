package com.ai.yc.common.api.syspurpose.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.common.api.syspurpose.interfaces.IQuerySysPurposeSV;
import com.ai.yc.common.api.syspurpose.param.CheckPurposeCn;
import com.ai.yc.common.api.syspurpose.param.DeleteSysPurpose;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryRequest;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryResponse;
import com.ai.yc.common.api.syspurpose.param.PurposePageVo;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeDetailsRes;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeListReq;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeListRes;
import com.ai.yc.common.api.syspurpose.param.SaveSysPurpose;
import com.ai.yc.common.api.syspurpose.param.SysPurposeVo;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.dao.mapper.bo.SysPurpose;
import com.ai.yc.common.service.business.syspurpose.IQuerySysPurposeBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 用途查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:28:30 
 * @version V1.0
 */
@Service
@Component
public class QuerySysPurposeSVImpl implements IQuerySysPurposeSV {
	
	@Autowired
	private transient IQuerySysPurposeBusiSV iQuerySysPurposeBusiSV;

	@Override
	public QuerySysPurposeListRes querySysPurposeList(QuerySysPurposeListReq req)
			throws BusinessException, SystemException {
		List<SysPurpose> purposes = iQuerySysPurposeBusiSV.querySysPurposeList(req.getLanguage());
		List<SysPurposeVo> vos = new ArrayList<SysPurposeVo>();
		for(SysPurpose purpose:purposes){
			SysPurposeVo vo = new SysPurposeVo();
			BeanUtils.copyProperties(vo, purpose);
			vos.add(vo);
		}
		QuerySysPurposeListRes res = new QuerySysPurposeListRes();
		res.setPurposes(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public QuerySysPurposeDetailsRes querySysPurposeDetails(String purposeId)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(purposeId)){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用途ID不能为空");
		}
		SysPurpose sysPurpose = iQuerySysPurposeBusiSV.querySysPurposeDetails(purposeId);
		if(sysPurpose==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "用途信息不存在");
		}
		QuerySysPurposeDetailsRes res  = new QuerySysPurposeDetailsRes();
		BeanUtils.copyProperties(res, sysPurpose);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public PurposePageQueryResponse queryPurposePage(PurposePageQueryRequest param)
			throws BusinessException, SystemException {
		
		PurposePageQueryResponse purposePageQueryResponse = new PurposePageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<PurposePageVo> pageInfo = iQuerySysPurposeBusiSV.queryPurposePage(param);
            purposePageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("用途列表查询成功");
            purposePageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            purposePageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("用途列表查询失败");
            purposePageQueryResponse.setResponseHeader(responseHeader);
        }
		return purposePageQueryResponse;
	}

	@Override
	public BaseResponse saveSysPurpose(SaveSysPurpose req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysPurposeBusiSV.saveSysPurpose(req);
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
	public Integer deleteSysPurpose(DeleteSysPurpose param) throws BusinessException, SystemException {
		return iQuerySysPurposeBusiSV.deleteSysPurpose(param.getPurposeId());
	}

	@Override
	public BaseListResponse<PurposePageVo> querySysPurposeById(DeleteSysPurpose param)
			throws BusinessException, SystemException {
		BaseListResponse<PurposePageVo> querySysPurposeByIds = new BaseListResponse<>();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			List<PurposePageVo> querySysPurposeById = iQuerySysPurposeBusiSV.querySysPurposeById(param);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("用途列表查询成功!");
			querySysPurposeByIds.setResponseHeader(responseHeader);
			querySysPurposeByIds.setResult(querySysPurposeById);
		}catch(Exception e){
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
			responseHeader.setResultMessage("用途列表查询失败!");
			querySysPurposeByIds.setResponseHeader(responseHeader);
		}
		return querySysPurposeByIds;
	}

	@Override
	public BaseResponse updateSysPurpose(SaveSysPurpose req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysPurposeBusiSV.updateSysPurpose(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("修改用途成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"修改用途失败");
		}
		return response;
	}

	@Override
	public Integer checkPurposeCn(CheckPurposeCn param) throws BusinessException, SystemException {
		return iQuerySysPurposeBusiSV.checkPurposeCn(param);
	}

}
