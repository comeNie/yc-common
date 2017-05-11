package com.ai.yc.common.service.business.sysduad.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysduad.param.CheckDuadCn;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryRequest;
import com.ai.yc.common.api.sysduad.param.DuadPageVo;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadById;
import com.ai.yc.common.api.sysduad.param.SaveSysDuad;
import com.ai.yc.common.constants.Constants;
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

	@Override
	public PageInfo<DuadPageVo> queryDuadPage(DuadPageQueryRequest param) {
		PageInfo<DuadPageVo> duadPageInfo = iSysDuadAtomSV.queryDuadPage(param);
		return duadPageInfo;
	}

	@Override
	public Integer saveSysDuad(SaveSysDuad req) {
		SysDuad sysDuad = new SysDuad();
		Long duadId = SeqUtil.getNewId(Constants.SEQ.DUAD_ID_SEQ);
		BeanUtils.copyProperties(sysDuad, req);
		sysDuad.setDuadId(String.valueOf(duadId));
		return iSysDuadAtomSV.iSysDuadAtomSV(sysDuad);
	}

	@Override
	public List<DuadPageVo> querySysDuadById(QuerySysDuadById param) {
		return iSysDuadAtomSV.querySysDuadById(param);
	}

	@Override
	public Integer updateSysDuad(SaveSysDuad req) {
		SysDuad sysDuad = new SysDuad();
		BeanUtils.copyProperties(sysDuad, req);
		return iSysDuadAtomSV.updateSysDuad(sysDuad);
	}

	@Override
	public Integer checkDuadCn(CheckDuadCn param) {
		return iSysDuadAtomSV.checkDuadCn(param);
	}

}
