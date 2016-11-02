package com.ai.platform.common.api.syspurpose.impl;

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
import com.ai.platform.common.api.syspurpose.interfaces.IQuerySysPurposeSV;
import com.ai.platform.common.api.syspurpose.param.QuerySysPurposeDetailsRes;
import com.ai.platform.common.api.syspurpose.param.QuerySysPurposeListRes;
import com.ai.platform.common.api.syspurpose.param.SysPurposeVo;
import com.ai.platform.common.constants.ResultCodeConstants;
import com.ai.platform.common.dao.mapper.bo.SysPurpose;
import com.ai.platform.common.service.business.syspurpose.IQuerySysPurposeBusiSV;
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
	public QuerySysPurposeListRes querySysPurposeList(String language)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(language)){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数语言不能为空");
		}
		List<SysPurpose> purposes = iQuerySysPurposeBusiSV.querySysPurposeList(language);
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

}
