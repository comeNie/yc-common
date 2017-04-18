package com.ai.yc.common.api.sysdomain.impl;

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
import com.ai.yc.common.api.sysdomain.interfaces.IQuerySysDomainSV;
import com.ai.yc.common.api.sysdomain.param.DeleteSysDomain;
import com.ai.yc.common.api.sysdomain.param.DomainPageQueryResponse;
import com.ai.yc.common.api.sysdomain.param.DomainPageVo;
import com.ai.yc.common.api.sysdomain.param.DomainQueryRequest;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainDetailsRes;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainListReq;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainListRes;
import com.ai.yc.common.api.sysdomain.param.SaveSysDomain;
import com.ai.yc.common.api.sysdomain.param.SysDomainVo;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryResponse;
import com.ai.yc.common.api.syspurpose.param.PurposePageVo;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.dao.mapper.bo.SysDomain;
import com.ai.yc.common.service.business.sysdomain.IQuerySysDomainBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 领域查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:53:41 
 * @version V1.0
 */
@Service
@Component
public class QuerySysDomainSVImpl implements IQuerySysDomainSV {
	
	@Autowired
	private transient IQuerySysDomainBusiSV querySysDomainBusiSV;
	
	@Override
	public QuerySysDomainDetailsRes querySysDomainDetails(String domainId)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(domainId)){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "领域ID不能为空");
		}
		SysDomain sysDomain = querySysDomainBusiSV.querySysDomainDetails(domainId);
		if(sysDomain==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "领域不存在");
		}
		QuerySysDomainDetailsRes res = new QuerySysDomainDetailsRes();
		BeanUtils.copyProperties(res, sysDomain);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}


	@Override
	public QuerySysDomainListRes querySysDomainList(QuerySysDomainListReq req)
			throws BusinessException, SystemException {
		List<SysDomain> domains = querySysDomainBusiSV.querySysDomainList(req.getLanguage());
		List<SysDomainVo> vos = new ArrayList<SysDomainVo>();
		for(SysDomain domain:domains){
			SysDomainVo vo = new SysDomainVo();
			BeanUtils.copyProperties(vo, domain);
			vos.add(vo);
		}
		QuerySysDomainListRes res = new QuerySysDomainListRes();
		res.setDomainVos(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}


	@Override
	public DomainPageQueryResponse queryDomainPage(DomainQueryRequest param) throws BusinessException, SystemException {
		DomainPageQueryResponse domainPageQueryResponse = new DomainPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<DomainPageVo> pageInfo = querySysDomainBusiSV.queryDomainPage(param);
            domainPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("领域列表查询成功");
            domainPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            domainPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("领域列表查询失败");
            domainPageQueryResponse.setResponseHeader(responseHeader);
        }
		return domainPageQueryResponse;
	}


	@Override
	public BaseResponse saveSysDomain(SaveSysDomain req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			querySysDomainBusiSV.saveSysDomain(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("添加领域成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"添加领域失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysDomain(DeleteSysDomain param) throws BusinessException, SystemException {
		return querySysDomainBusiSV.deleteSysDomain(param.getDomainId());
	}


	@Override
	public BaseListResponse<DomainPageVo> querySysDomainById(DeleteSysDomain param)
			throws BusinessException, SystemException {
		BaseListResponse<DomainPageVo> querySysDomainByIds = new BaseListResponse<>();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			List<DomainPageVo> querySysDomainById = querySysDomainBusiSV.querySysDomainById(param);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("领域列表查询成功!");
			querySysDomainByIds.setResponseHeader(responseHeader);
			querySysDomainByIds.setResult(querySysDomainById);
		}catch(Exception e){
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
			responseHeader.setResultMessage("领域列表查询失败!");
			querySysDomainByIds.setResponseHeader(responseHeader);
		}
		return querySysDomainByIds;
	}


	@Override
	public BaseResponse updateSysDomain(SaveSysDomain req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			querySysDomainBusiSV.updateSysDomain(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("修改领域成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"修改领域失败");
		}
		return response;
	}

	
}
