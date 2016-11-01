package com.ai.platform.common.service.business.sysduad;

import java.util.List;

import com.ai.platform.common.dao.mapper.bo.SysDuad;

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

}
