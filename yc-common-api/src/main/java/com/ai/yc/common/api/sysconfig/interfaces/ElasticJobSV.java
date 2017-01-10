package com.ai.yc.common.api.sysconfig.interfaces;

/**
 * Created by apple on 17/1/10.
 */

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Description: 自动处理订单服务
 * @author wtf 1031248990@qq.com
 * @date 2016年11月1日 下午2:29:36
 * @version V1.0
 */
@Path("/auto")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ElasticJobSV {

    /**
     * 自动取消（关闭）订单服务
     * @param
     * @return
     * @throws BusinessException,SystemException
     * @author
     * @ApiDocMethod
     * @ApiCode EJ_1
     * @RestRelativeURL auto/autoIncreaseHomeNum
     */
    @POST
    @Path("/autoIncreaseHomeNum")
    BaseResponse autoIncreaseHomeNum() throws BusinessException,SystemException;

}
