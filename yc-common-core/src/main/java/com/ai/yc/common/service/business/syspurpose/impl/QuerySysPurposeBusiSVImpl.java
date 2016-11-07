package com.ai.yc.common.service.business.syspurpose.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysPurpose;
import com.ai.yc.common.service.atom.syspurpose.ISysPurposeAtomSV;
import com.ai.yc.common.service.business.syspurpose.IQuerySysPurposeBusiSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:33:45 
 * @version V1.0
 */
@Service
public class QuerySysPurposeBusiSVImpl implements IQuerySysPurposeBusiSV {
	
	@Autowired 
	private transient ISysPurposeAtomSV  iSysPurposeAtomSV;

	@Override
	public List<SysPurpose> querySysPurposeList(String language) {
		
		return iSysPurposeAtomSV.querySysPurposeList(language);
	}

	@Override
	public SysPurpose querySysPurposeDetails(String purposeId) {

		return iSysPurposeAtomSV.selectByPrimaryKey(purposeId);
	}

}
