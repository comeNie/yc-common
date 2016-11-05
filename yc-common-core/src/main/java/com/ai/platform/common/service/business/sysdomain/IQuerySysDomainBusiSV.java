package com.ai.platform.common.service.business.sysdomain;

import java.util.List;

import com.ai.platform.common.dao.mapper.bo.SysDomain;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:57:26 
 * @version V1.0
 */
public interface IQuerySysDomainBusiSV {
	
	List<SysDomain> querySysDomainList(String language);
	
	SysDomain querySysDomainDetails(String domainId);

}
