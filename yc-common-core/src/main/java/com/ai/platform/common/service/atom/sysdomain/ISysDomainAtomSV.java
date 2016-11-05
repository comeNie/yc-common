package com.ai.platform.common.service.atom.sysdomain;

import java.util.List;

import com.ai.platform.common.dao.mapper.bo.SysDomain;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:10:06 
 * @version V1.0
 */
public interface ISysDomainAtomSV {
	
	/**
	 * 获取显示的列表
	 */
	List<SysDomain> querySysDomainList(String language);
	
	SysDomain selectByPrimaryKey(String domainId);

}
