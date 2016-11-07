package com.ai.yc.common.api.syspurpose.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeDetailsRes;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeListRes;

/**
 * @Description: 用途查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午2:29:36 
 * @version V1.0
 */
@Path("/syspurpose")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysPurposeSV {
	

    /**
     * 用途列表查询
     * @param language 语言
     * @return 用途列表
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0503
     * @RestRelativeURL syspurpose/querySysPurposeList
	 */
	@POST
	@Path("/syspurpose")
	QuerySysPurposeListRes querySysPurposeList(String language)throws BusinessException,SystemException;
	
	/**
     * 用途详情查询
     * @param purposeId 用途ID
     * @return  用途列表
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0511
     * @RestRelativeURL syspurpose/querySysPurposeDetails
	 */
	@POST
	@Path("/syspurpose")
	QuerySysPurposeDetailsRes querySysPurposeDetails(String purposeId)throws BusinessException,SystemException;

}
