package com.ai.yc.common.service.business.sysregist.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.dao.mapper.bo.SysRegist;
import com.ai.yc.common.service.atom.sysregist.ISysRegistAtomSV;
import com.ai.yc.common.service.business.sysregist.IQuerySysRegistBusiSV;

/**
* @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Service
public class QuerySysRegistBusiSVImpl implements IQuerySysRegistBusiSV {
	
	@Autowired 
	private transient ISysRegistAtomSV  iSysRegistAtomSV;

	@Override
	public SysRegist querySysRegist() {
		return iSysRegistAtomSV.querySysRegist();
	}

	@Override
	public Integer updateSysRegist(SaveSysBasic req) {
		SysRegist sysRegist = new SysRegist();
		sysRegist.setAid(req.getAid());
		sysRegist.setActiviceName(req.getActiviceName());
		sysRegist.setActiviceNum(req.getActiviceNum());
		sysRegist.setAstate(req.getDstate());
		return iSysRegistAtomSV.updateSysRegist(sysRegist);
	}


}
