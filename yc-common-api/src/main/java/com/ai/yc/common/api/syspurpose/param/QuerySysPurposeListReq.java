package com.ai.yc.common.api.syspurpose.param;

import com.ai.opt.base.vo.BaseInfo;

public class QuerySysPurposeListReq extends BaseInfo{

	private static final long serialVersionUID = 1834257059448657467L;
	
	/**
	 * 语言
	 */
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
