package com.ai.yc.common.api.syssensitive.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryResponse;

/**
 * @Description: 敏感词查询服务
 * @author shancc
 * @date 2017年5月17日 
 * @version V1.0.1
 */
@Path("/syssensitive")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysSensitiveSV {
	
	/**
     * 敏感词查询
     * @return 题目列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssensitive/querySensitivePage
	 */
	@POST
	@Path("/querySensitivePage")
	public SensitivePageQueryResponse querySensitivePage(SensitivePageQueryRequest param)throws BusinessException,SystemException;
}
