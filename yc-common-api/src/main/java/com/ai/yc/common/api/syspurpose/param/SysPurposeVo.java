package com.ai.yc.common.api.syspurpose.param;

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
     * 中文名称
     */
    private String purposeCn;

    /**
     * 英文名称
     */
    private String purposeEn;

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

	public String getPurposeCn() {
		return purposeCn;
	}

	public void setPurposeCn(String purposeCn) {
		this.purposeCn = purposeCn;
	}

	public String getPurposeEn() {
		return purposeEn;
	}

	public void setPurposeEn(String purposeEn) {
		this.purposeEn = purposeEn;
	}

	

}
