package com.ai.yc.common.api.sysduad.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午7:04:09
 * @version V1.0
 */
public class QuerySysDuadDetailsRes extends BaseResponse {

	private static final long serialVersionUID = -4901957838597069321L;

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

	/**
	 * 订单类型，文档翻译：1；口译：2；快速翻译：0；
	 */
	private String orderType;

	/**
	 * 源语言中文名称
	 */
	private String sourceCn;

	/**
	 * 源语言英文名称
	 */
    private String sourceEn;
    
    /**
     * 目标语言中文名称
     */
    private String targetCn;
    
    /**
     * 目标语言英文名称
     */
    private String targetEn;

	/**
	 * 普通翻译价格
	 */
	private String ordinary;

	/**
	 * 普通加急翻译价格
	 */
	private String ordinaryUrgent;

	/**
	 * 专业翻译价格
	 */
	private String professional;

	/**
	 * 专业加急翻译价格
	 */
	private String professionalUrgent;

	/**
	 * 出版翻译价格
	 */
	private String publish;

	/**
	 * 出版加急翻译价格
	 */
	private String publishUrgent;

	/**
	 * 排序
	 */
	private String sort;

	/**
	 * 状态  0显示  1不显示
	 */
	private String state;
	
	/**
	 * 币种  1：RMB 2：$
	 */
	private String currency;
	
	private String sourceCode;
	  private String targetCode;

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}

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

	public String getSourceCn() {
		return sourceCn;
	}

	public void setSourceCn(String sourceCn) {
		this.sourceCn = sourceCn;
	}

	public String getSourceEn() {
		return sourceEn;
	}

	public void setSourceEn(String sourceEn) {
		this.sourceEn = sourceEn;
	}

	public String getTargetCn() {
		return targetCn;
	}

	public void setTargetCn(String targetCn) {
		this.targetCn = targetCn;
	}

	public String getTargetEn() {
		return targetEn;
	}

	public void setTargetEn(String targetEn) {
		this.targetEn = targetEn;
	}

	public String getOrdinary() {
		return ordinary;
	}

	public void setOrdinary(String ordinary) {
		this.ordinary = ordinary;
	}

	public String getOrdinaryUrgent() {
		return ordinaryUrgent;
	}

	public void setOrdinaryUrgent(String ordinaryUrgent) {
		this.ordinaryUrgent = ordinaryUrgent;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public String getProfessionalUrgent() {
		return professionalUrgent;
	}

	public void setProfessionalUrgent(String professionalUrgent) {
		this.professionalUrgent = professionalUrgent;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getPublishUrgent() {
		return publishUrgent;
	}

	public void setPublishUrgent(String publishUrgent) {
		this.publishUrgent = publishUrgent;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	

}
