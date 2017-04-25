package com.ai.yc.common.service.atom.sysduad;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysduad.param.CheckDuadCn;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryRequest;
import com.ai.yc.common.api.sysduad.param.DuadPageVo;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadById;
import com.ai.yc.common.dao.mapper.bo.SysDuad;

public interface ISysDuadAtomSV {
	
	/**
	 * 获取页面显示的
	 */
	List<SysDuad> querySysDuadList(String language,String orderType);
	
	SysDuad querySysDuadDetails(String duadId);

	PageInfo<DuadPageVo> queryDuadPage(DuadPageQueryRequest param);

	Integer iSysDuadAtomSV(SysDuad sysDuad);

	List<DuadPageVo> querySysDuadById(QuerySysDuadById param);

	Integer updateSysDuad(SysDuad sysDuad);

	Integer checkDuadCn(CheckDuadCn param);

}
