package com.ai.platform.common.api.sysduad.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.platform.common.api.sysduad.param.QuerySysDuadDetailsRes;
import com.ai.platform.common.api.sysduad.param.QuerySysDuadListReq;
import com.ai.platform.common.api.sysduad.param.QuerySysDuadListRes;

/**
 * @Description: 语言对查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午3:07:13 
 * @version V1.0
 */
@Path("/querysysduad")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysDuadSV {
	
	 /**
     * 语言对列表查询
     * @param req
     * @return 语言对列表
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0509
     * @RestRelativeURL sysduad/querySysDuadList
	 */
	@POST
	@Path("/sysduad")
	QuerySysDuadListRes querySysDuadList(QuerySysDuadListReq req)throws BusinessException,SystemException;
	
	 /**
     * 语言对详情查询
     * @param duadId 编号
     * @return 语言对详情
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0510
     * @RestRelativeURL sysduad/querySysDuadDetails
	 */
	@POST
	@Path("/sysduad")
	QuerySysDuadDetailsRes querySysDuadDetails(String duadId)throws BusinessException,SystemException;

}
