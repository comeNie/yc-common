package com.ai.yc.common.api.sysdomain.param;

import com.ai.opt.base.vo.BaseInfo;

public class QuerySysDomainListReq extends BaseInfo {

	private static final long serialVersionUID = 6622412067930175539L;
	
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
