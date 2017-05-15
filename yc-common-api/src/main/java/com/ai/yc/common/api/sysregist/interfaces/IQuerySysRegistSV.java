package com.ai.yc.common.api.sysregist.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.api.sysregist.param.QuerySysRegistListRes;

/**
 * @Description: 基本设置查询服务
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Path("/sysregist")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysRegistSV {
	
	/**
     * 基本设置查询分页
     * @return 基本设置列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysregist/queryRegist
	 */
	@POST
	@Path("/queryRegist")
	public QuerySysRegistListRes queryRegist()throws BusinessException,SystemException;
	
	/**
	 * 保存基本设置
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysregist/saveRegist
     */
	@POST
	@Path("/saveRegist")
	public BaseResponse saveRegist(SaveSysBasic req)throws BusinessException,SystemException;
}
