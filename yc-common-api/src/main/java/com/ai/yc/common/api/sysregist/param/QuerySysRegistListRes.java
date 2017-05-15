package com.ai.yc.common.api.sysregist.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0.1
 */
public class QuerySysRegistListRes extends BaseResponse{

	private static final long serialVersionUID = 1L;
	private List<SysRegistVo> regists;

	public List<SysRegistVo> getRegists() {
		return regists;
	}

	public void setRegists(List<SysRegistVo> regists) {
		this.regists = regists;
	}

	
}
