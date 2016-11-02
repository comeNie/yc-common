package com.ai.platform.common.api.syspurpose.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月2日 下午2:46:58 
 * @version V1.0
 */
public class QuerySysPurposeDetailsRes extends BaseResponse {
	
	private static final long serialVersionUID = 7039545203523157889L;
	
	/**
	 * 起名标语 是
	 */
	public final static String NAME_FLAG_YES = "0";

	/**
	 * 起名标语 否
	 */
	public final static String NAME_FLAG_NO = "1";

	/**
	 * 用途ID
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
     * 名称
     */
    private String purposeName;

    /**
     * 描述
     */
    private String remarks;

    /**
     * 排序
     */
    private String sort;

    /**
     * 状态  0显示  1隐藏
     */
    private String state;

    /**
     * 是否起名标语：0：是；1：否
     */
    private String namedFlag;

	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
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

	public String getPurposeName() {
		return purposeName;
	}

	public void setPurposeName(String purposeName) {
		this.purposeName = purposeName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNamedFlag() {
		return namedFlag;
	}

	public void setNamedFlag(String namedFlag) {
		this.namedFlag = namedFlag;
	}
    
    

}
