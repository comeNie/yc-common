package com.ai.yc.common.service.business.sysduad.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysDuad;
import com.ai.yc.common.service.atom.sysduad.ISysDuadAtomSV;
import com.ai.yc.common.service.business.sysduad.IQuerySysDuadBusiSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午7:49:12 
 * @version V1.0
 */
@Service
public class QuerySysDuadBusiSVImpl implements IQuerySysDuadBusiSV{
	
	@Autowired
	private transient ISysDuadAtomSV iSysDuadAtomSV;

	@Override
	public List<SysDuad> querySysDuadList(String language, String orderType) {
		
		return iSysDuadAtomSV.querySysDuadList(language, orderType);
	}

	@Override
	public SysDuad querySysDuadDetails(String duadId) {
		return iSysDuadAtomSV.querySysDuadDetails(duadId);
	}

}
