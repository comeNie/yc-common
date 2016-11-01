package com.ai.platform.common.api.sysdomain.impl;

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
import com.ai.platform.common.api.sysdomain.interfaces.IQuerySysDomainSV;
import com.ai.platform.common.api.sysdomain.param.QuerySysDomainListRes;
import com.ai.platform.common.api.sysdomain.param.SysDomainVo;
import com.ai.platform.common.constants.ResultCodeConstants;
import com.ai.platform.common.dao.mapper.bo.SysDomain;
import com.ai.platform.common.service.business.sysdomain.IQuerySysDomainBusiSV;
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
	public QuerySysDomainListRes querySysDomainList(String language)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(language)){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "参数语言不能为空");
		}
		List<SysDomain> domains = querySysDomainBusiSV.querySysDomainList(language);
		List<SysDomainVo> vos = new ArrayList<SysDomainVo>();
		for(SysDomain domain:domains){
			SysDomainVo vo = new SysDomainVo();
			BeanUtils.copyProperties(vo, domain);
			vos.add(vo);
		}
		QuerySysDomainListRes res = new QuerySysDomainListRes();
		res.setDomains(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

}
