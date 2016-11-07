package com.ai.yc.common.service.business.sysdomain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysDomain;
import com.ai.yc.common.service.atom.sysdomain.ISysDomainAtomSV;
import com.ai.yc.common.service.business.sysdomain.IQuerySysDomainBusiSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:58:51 
 * @version V1.0
 */
@Service
public class IQuerySysDomainBusiSVImpl implements IQuerySysDomainBusiSV {
	
	@Autowired
	private transient ISysDomainAtomSV iSysDomainAtomSV;

	@Override
	public List<SysDomain> querySysDomainList(String language) {
		return iSysDomainAtomSV.querySysDomainList(language);
	}

	@Override
	public SysDomain querySysDomainDetails(String domainId) {
		return iSysDomainAtomSV.selectByPrimaryKey(domainId);
	}

}
