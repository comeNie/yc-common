package com.ai.platform.common.service.atom.syspurpose;

import java.util.List;

import com.ai.platform.common.dao.mapper.bo.SysPurpose;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:35:25 
 * @version V1.0
 */
public interface ISysPurposeAtomSV {
	
	/**
	 * 查询页面显示的用途
	 */
	List<SysPurpose> querySysPurposeList(String language);

}
