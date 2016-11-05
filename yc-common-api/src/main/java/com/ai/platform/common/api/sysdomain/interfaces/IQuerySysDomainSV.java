package com.ai.platform.common.api.sysdomain.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.platform.common.api.sysdomain.param.QuerySysDomainListRes;

/**
 * @Description: 领域查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午2:29:36 
 * @version V1.0
 */
@Path("/sysdomain")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysDomainSV {
	
	 /**
     * 领域列表查询
     * @param language 语言
     * @return 领域列表
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0508
     * @RestRelativeURL sysdomain/querySysDomainList
	 */
	@POST
	@Path("/sysdomain")
	QuerySysDomainListRes querySysDomainList(String language)throws BusinessException,SystemException;
	
	/**
     * 领域详情查询
     * @param domainId 领域ID
     * @return 领域详情
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0512
     * @RestRelativeURL sysdomain/querySysDomainDetails
	 */
	@POST
	@Path("/sysdomain")
	QuerySysDomainListRes querySysDomainDetails(String domainId)throws BusinessException,SystemException;

}
