package com.ai.yc.common.api.sysjf.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.api.sysjf.param.QuerySysJfListRes;

/**
 * @Description: 签到送积分查询服务
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Path("/sysjf")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysJfSV {
	
	/**
     * 签到送积分查询
     * @return 基本设置列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysjf/queryJf
	 */
	@POST
	@Path("/queryJf")
	public QuerySysJfListRes queryJf()throws BusinessException,SystemException;
	
	/**
	 * 保存积分数
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysjf/saveJf
     */
	@POST
	@Path("/saveJf")
	public BaseResponse saveJf(SaveSysBasic req)throws BusinessException,SystemException;
}
