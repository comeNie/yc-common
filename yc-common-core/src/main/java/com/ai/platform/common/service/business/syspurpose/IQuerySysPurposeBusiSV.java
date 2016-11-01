package com.ai.platform.common.service.business.syspurpose;

import java.util.List;

import com.ai.platform.common.dao.mapper.bo.SysPurpose;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:32:12 
 * @version V1.0
 */
public interface IQuerySysPurposeBusiSV {
	
	/**
	 * 查询页面显示的用途
	 */
	List<SysPurpose> querySysPurposeList(String language);

}
