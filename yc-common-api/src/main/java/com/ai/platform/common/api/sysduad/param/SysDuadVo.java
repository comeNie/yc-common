package com.ai.platform.common.api.sysduad.param;

import java.io.Serializable;

public class SysDuadVo implements Serializable {

	private static final long serialVersionUID = 6022446114669473771L;

	/**
	 * 编号
	 */
	private String duadId;

	/**
	 * 语言
	 */
	private String language;

	/**
	 * 站点
	 */
	private String site;

	private String orderType;

	private String sourceLanguage;

	private String targetLanguage;

	public String getDuadId() {
		return duadId;
	}

	public void setDuadId(String duadId) {
		this.duadId = duadId;
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

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getSourceLanguage() {
		return sourceLanguage;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}

	public String getTargetLanguage() {
		return targetLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}
	
	

}
