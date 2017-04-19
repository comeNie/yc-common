package com.ai.yc.common.api.sysduad.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryRequest;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryResponse;
import com.ai.yc.common.api.sysduad.param.DuadPageVo;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadById;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadDetailsRes;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListReq;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListRes;
import com.ai.yc.common.api.sysduad.param.SaveSysDuad;

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
     * @RestRelativeURL querysysduad/querySysDuadList
	 */
	@POST
	@Path("/querySysDuadList")
	QuerySysDuadListRes querySysDuadList(QuerySysDuadListReq req)throws BusinessException,SystemException;
	
	 /**
     * 语言对详情查询
     * @param duadId 编号
     * @return 语言对详情
     * @throws BusinessException,SystemException
     * @author hougang
     * @ApiDocMethod
     * @ApiCode GN_0510
     * @RestRelativeURL querysysduad/querySysDuadDetails
	 */
	@POST
	@Path("/querySysDuadDetails")
	QuerySysDuadDetailsRes querySysDuadDetails(String duadId)throws BusinessException,SystemException;
	
	/**
     * 语言对列表查询分页
     * @return 语言对列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL querysysduad/queryDuadPage
	 */
	@POST
	@Path("/queryDuadPage")
	public DuadPageQueryResponse queryDuadPage(DuadPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加语言对
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL querysysduad/saveSysDuad
     */
	@POST
	@Path("/saveSysDuad")
	public BaseResponse saveSysDuad(SaveSysDuad req)throws BusinessException,SystemException;
	
	/**
	 * 根据语言对ID查询语言对
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL querysysduad/querySysDuadById
     */
	@POST
	@Path("/querySysDuadById")
	public BaseListResponse<DuadPageVo> querySysDuadById(QuerySysDuadById param)throws BusinessException,SystemException;
	
	/**
	 * 修改语言对
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL querysysduad/updateSysDuad
     */
	@POST
	@Path("/updateSysDuad")
	public BaseResponse updateSysDuad(SaveSysDuad req)throws BusinessException,SystemException;

}
