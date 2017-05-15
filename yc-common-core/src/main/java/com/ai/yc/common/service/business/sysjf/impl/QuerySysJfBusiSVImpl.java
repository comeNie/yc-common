package com.ai.yc.common.service.business.sysjf.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.dao.mapper.bo.SysJf;
import com.ai.yc.common.service.atom.sysjf.ISysJfAtomSV;
import com.ai.yc.common.service.business.sysjf.IQuerySysJfBusiSV;

/**
* @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Service
public class QuerySysJfBusiSVImpl implements IQuerySysJfBusiSV {
	
	@Autowired 
	private transient ISysJfAtomSV  iSysJfAtomSV;

	@Override
	public List<SysJf> querySysJf() {
		return iSysJfAtomSV.querySysJf();
	}

	@Override
	public Integer updateSysJf(SaveSysBasic req) {
		SysJf sysJf = new SysJf();
		sysJf.setDid(req.getDid());
		sysJf.setOneDay(req.getOneDay());
		sysJf.setTwoDay(req.getTwoDay());
		sysJf.setThreeDay(req.getThreeDay());
		sysJf.setFourDay(req.getFourDay());
		sysJf.setFiveDay(req.getFiveDay());
		sysJf.setSixDay(req.getSixDay());
		sysJf.setSevenDay(req.getSevenDay());
		sysJf.setState(req.getDstate());
		return iSysJfAtomSV.updateSysJf(sysJf);
	}


}
