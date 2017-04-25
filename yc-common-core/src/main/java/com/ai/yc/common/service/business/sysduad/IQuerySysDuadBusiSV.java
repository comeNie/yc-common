package com.ai.yc.common.service.business.sysduad;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysduad.param.CheckDuadCn;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryRequest;
import com.ai.yc.common.api.sysduad.param.DuadPageVo;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadById;
import com.ai.yc.common.api.sysduad.param.SaveSysDuad;
import com.ai.yc.common.dao.mapper.bo.SysDuad;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午7:43:52 
 * @version V1.0
 */
public interface IQuerySysDuadBusiSV {
	
	/**
	 * 获取页面显示的
	 */
	List<SysDuad> querySysDuadList(String language,String orderType);
	
	SysDuad querySysDuadDetails(String duadId);

	PageInfo<DuadPageVo> queryDuadPage(DuadPageQueryRequest param);

	Integer saveSysDuad(SaveSysDuad req);

	List<DuadPageVo> querySysDuadById(QuerySysDuadById param);

	Integer updateSysDuad(SaveSysDuad req);

	Integer checkDuadCn(CheckDuadCn param);

}
