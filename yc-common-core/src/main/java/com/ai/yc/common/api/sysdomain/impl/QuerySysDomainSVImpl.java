package com.ai.yc.common.api.sysdomain.impl;

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
import com.ai.yc.common.api.sysdomain.interfaces.IQuerySysDomainSV;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainDetailsRes;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainListRes;
import com.ai.yc.common.api.sysdomain.param.SysDomainVo;
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
	public QuerySysDomainListRes querySysDomainList()
			throws BusinessException, SystemException {
		List<SysDomain> domains = querySysDomainBusiSV.querySysDomainList(null);
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

	
}
