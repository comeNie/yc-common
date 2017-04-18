package com.ai.yc.common.api.sysduad.impl;

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
import com.ai.yc.common.api.sysduad.interfaces.IQuerySysDuadSV;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryRequest;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryResponse;
import com.ai.yc.common.api.sysduad.param.DuadPageVo;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadById;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadDetailsRes;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListReq;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListRes;
import com.ai.yc.common.api.sysduad.param.SaveSysDuad;
import com.ai.yc.common.api.sysduad.param.SysDuadVo;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.dao.mapper.bo.SysDuad;
import com.ai.yc.common.service.business.sysduad.IQuerySysDuadBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 语言对查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午7:42:19 
 * @version V1.0
 */
@Service
@Component
public class QuerySysDuadSVImpl implements IQuerySysDuadSV {
	
	@Autowired
	private transient IQuerySysDuadBusiSV iQuerySysDuadBusiSV;

	@Override
	public QuerySysDuadListRes querySysDuadList(QuerySysDuadListReq req)
			throws BusinessException, SystemException {
		if(req==null){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数不能为空");
		}
		List<SysDuad> duads = iQuerySysDuadBusiSV.querySysDuadList(req.getLanguage(), req.getOrderType());
		List<SysDuadVo> vos = new ArrayList<SysDuadVo>();
		for(SysDuad duad:duads){
			SysDuadVo vo = new SysDuadVo();
			BeanUtils.copyProperties(vo, duad);
			vos.add(vo);
		}
		QuerySysDuadListRes res = new QuerySysDuadListRes();
		res.setDuads(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public QuerySysDuadDetailsRes querySysDuadDetails(String duadId)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(duadId)){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "编号不能为空");
		}
		SysDuad duad = iQuerySysDuadBusiSV.querySysDuadDetails(duadId);
		if(duad==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "语言对信息不存在");
		}
		QuerySysDuadDetailsRes res = new QuerySysDuadDetailsRes();
		BeanUtils.copyProperties(res, duad);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public DuadPageQueryResponse queryDuadPage(DuadPageQueryRequest param) throws BusinessException, SystemException {
		DuadPageQueryResponse duadPageQueryResponse = new DuadPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<DuadPageVo> pageInfo = iQuerySysDuadBusiSV.queryDuadPage(param);
            duadPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("语言对列表查询成功");
            duadPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            duadPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("语言对列表查询失败");
            duadPageQueryResponse.setResponseHeader(responseHeader);
        }
		return duadPageQueryResponse;
	}

	@Override
	public BaseResponse saveSysDuad(SaveSysDuad req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysDuadBusiSV.saveSysDuad(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("添加语言对成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"添加语言对失败");
		}
		return response;
	}

	@Override
	public BaseListResponse<DuadPageVo> querySysDuadById(QuerySysDuadById param)
			throws BusinessException, SystemException {
		BaseListResponse<DuadPageVo> querySysDuadByIds = new BaseListResponse<>();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			List<DuadPageVo> querySysDuadById = iQuerySysDuadBusiSV.querySysDuadById(param);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("语言对列表查询成功!");
			querySysDuadByIds.setResponseHeader(responseHeader);
			querySysDuadByIds.setResult(querySysDuadById);
		}catch(Exception e){
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
			responseHeader.setResultMessage("语言对列表查询失败!");
			querySysDuadByIds.setResponseHeader(responseHeader);
		}
		return querySysDuadByIds;
	}

	@Override
	public BaseResponse updateSysDuad(SaveSysDuad req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysDuadBusiSV.updateSysDuad(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("修改语言对成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"修改语言对失败");
		}
		return response;
	}

}
