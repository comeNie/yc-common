package com.ai.yc.common.api.sysbasic.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0.1
 */
public class QuerySysBasicJfRegistListRes extends BaseResponse{

	private static final long serialVersionUID = -4982972484450590587L;
	
	private List<SysBasicJfRegistVo> basicjfregists;

	public List<SysBasicJfRegistVo> getBasicjfregists() {
		return basicjfregists;
	}

	public void setBasicjfregists(List<SysBasicJfRegistVo> basicjfregists) {
		this.basicjfregists = basicjfregists;
	}
}
