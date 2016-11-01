package com.ai.platform.common.api.sysduad.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.platform.common.api.sysduad.interfaces.IQuerySysDuadSV;
import com.ai.platform.common.api.sysduad.param.QuerySysDuadDetailsRes;
import com.ai.platform.common.api.sysduad.param.QuerySysDuadListReq;
import com.ai.platform.common.api.sysduad.param.QuerySysDuadListRes;
import com.ai.platform.common.api.sysduad.param.SysDuadVo;
import com.ai.platform.common.constants.ResultCodeConstants;
import com.ai.platform.common.dao.mapper.bo.SysDuad;
import com.ai.platform.common.service.business.sysduad.IQuerySysDuadBusiSV;
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
		if(StringUtil.isBlank(req.getLanguage())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数语言不能为空");
		}
		if(StringUtil.isBlank(req.getOrderType())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "订单类型不能为空");
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

}
