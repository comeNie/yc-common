package com.ai.yc.common.api.sysduad.param;

import java.io.Serializable;

import com.ai.opt.base.vo.PageInfo;

public class DuadPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 中文名称
     */
    private String language;

	/**
	 * 站点
	 */
	private String site;
	/**
	 * 状态：显示：0，隐藏：1
	 */
	private String state;
	/**
     * 分页时必填
     */
    PageInfo<DuadPageVo> pageInfo;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public PageInfo<DuadPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<DuadPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}
