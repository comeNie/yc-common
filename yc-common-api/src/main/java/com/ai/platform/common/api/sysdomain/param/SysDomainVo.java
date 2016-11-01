package com.ai.platform.common.api.sysdomain.param;

import java.io.Serializable;

public class SysDomainVo implements Serializable{

	private static final long serialVersionUID = -7191568125734573208L;
	
	/**
	 * 编号
	 */
	private String domainId;

    /**
     * 语言
     */
    private String language;

    /**
     * 站点
     */
    private String site;

    /**
     * 名称
     */
    private String domainName;

    /**
     * 描述
     */
    private String remarks;

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
    


}
