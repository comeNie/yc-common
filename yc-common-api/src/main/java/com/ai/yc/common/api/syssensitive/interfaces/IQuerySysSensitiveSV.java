package com.ai.yc.common.api.syssensitive.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.common.api.syssensitive.param.DeleteSysSensitive;
import com.ai.yc.common.api.syssensitive.param.SaveSysSensitive;
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
	
	/**
	 * 添加敏感词
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssensitive/saveSysSensitive
     */
	@POST
	@Path("/saveSysSensitive")
	public BaseResponse saveSysSensitive(SaveSysSensitive req)throws BusinessException,SystemException;
	
	/**
	 * 删除敏感词
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssensitive/deleteSysSensitive
     */
	@POST
	@Path("/deleteSysSensitive")
	public Integer deleteSysSensitive(DeleteSysSensitive param)throws BusinessException,SystemException;
	
	/**
	 * 修改敏感词
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssensitive/updateSysSensitive
     */
	@POST
	@Path("/updateSysSensitive")
	public BaseResponse updateSysSensitive(SaveSysSensitive req)throws BusinessException,SystemException;
}
