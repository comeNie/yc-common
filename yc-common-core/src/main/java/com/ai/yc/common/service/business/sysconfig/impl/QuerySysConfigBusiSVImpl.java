package com.ai.yc.common.service.business.sysconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysConfig;
import com.ai.yc.common.service.atom.sysconfig.ISysConfigAtomSV;
import com.ai.yc.common.service.business.sysconfig.IQuerySysConfigBusiSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:14:43 
 * @version V1.0
 */
@Service
public class QuerySysConfigBusiSVImpl implements IQuerySysConfigBusiSV{
	
	@Autowired
	private transient ISysConfigAtomSV iSysConfigAtomSV;

	@Override
	public SysConfig getSysCong() {
		
		return iSysConfigAtomSV.selectOne();
	}

}
