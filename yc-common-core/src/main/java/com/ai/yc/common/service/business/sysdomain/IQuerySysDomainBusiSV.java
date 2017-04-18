package com.ai.yc.common.service.business.sysdomain;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysdomain.param.DeleteSysDomain;
import com.ai.yc.common.api.sysdomain.param.DomainPageVo;
import com.ai.yc.common.api.sysdomain.param.DomainQueryRequest;
import com.ai.yc.common.api.sysdomain.param.SaveSysDomain;
import com.ai.yc.common.dao.mapper.bo.SysDomain;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:57:26 
 * @version V1.0
 */
public interface IQuerySysDomainBusiSV {
	
	List<SysDomain> querySysDomainList(String language);
	
	SysDomain querySysDomainDetails(String domainId);

	PageInfo<DomainPageVo> queryDomainPage(DomainQueryRequest param);

	Integer saveSysDomain(SaveSysDomain req);

	Integer deleteSysDomain(String domainId);

	List<DomainPageVo> querySysDomainById(DeleteSysDomain param);

	Integer updateSysDomain(SaveSysDomain req);

}
