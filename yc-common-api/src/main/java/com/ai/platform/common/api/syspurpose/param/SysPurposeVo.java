package com.ai.platform.common.api.syspurpose.param;

import java.io.Serializable;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午2:38:39
 * @version V1.0
 */
public class SysPurposeVo implements Serializable {

	private static final long serialVersionUID = 4771669111462242682L;

	/**
	 * 编号
	 */
	private String purposeId;

	/**
	 * 语言
	 */
	private String language;

	/**
	 * 站点
	 */
	private String site;

	/**
	 * 用途名称
	 */
	private String purposeName;

	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId == null ? null : purposeId.trim();
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language == null ? null : language.trim();
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site == null ? null : site.trim();
	}

	public String getPurposeName() {
		return purposeName;
	}

	public void setPurposeName(String purposeName) {
		this.purposeName = purposeName == null ? null : purposeName.trim();
	}

}
