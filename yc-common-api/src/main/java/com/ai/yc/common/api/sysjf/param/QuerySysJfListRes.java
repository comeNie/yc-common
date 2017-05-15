package com.ai.yc.common.api.sysjf.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0.1
 */
public class QuerySysJfListRes extends BaseResponse{

	private static final long serialVersionUID = -4982972484450590587L;
	
	private List<SysJfVo> jfs;

	public List<SysJfVo> getJfs() {
		return jfs;
	}

	public void setJfs(List<SysJfVo> jfs) {
		this.jfs = jfs;
	}
}
