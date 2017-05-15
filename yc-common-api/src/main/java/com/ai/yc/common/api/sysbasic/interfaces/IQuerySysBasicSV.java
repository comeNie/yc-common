package com.ai.yc.common.api.sysbasic.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.common.api.sysbasic.param.QuerySysBasicListRes;

/**
 * @Description: 基本设置查询服务
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Path("/sysbasic")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysBasicSV {
	
	/**
     * 基本设置查询分页
     * @return 基本设置列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysbasic/queryBasic
	 */
	@POST
	@Path("/queryBasic")
	public QuerySysBasicListRes queryBasic()throws BusinessException,SystemException;
	
}
