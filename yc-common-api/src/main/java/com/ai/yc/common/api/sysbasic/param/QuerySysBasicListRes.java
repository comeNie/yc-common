package com.ai.yc.common.api.sysbasic.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0.1
 */
public class QuerySysBasicListRes extends BaseResponse{

	private static final long serialVersionUID = -4982972484450590587L;
	
	private List<SysBasicVo> basics;

	public List<SysBasicVo> getBasics() {
		return basics;
	}

	public void setBasics(List<SysBasicVo> basics) {
		this.basics = basics;
	}
}
