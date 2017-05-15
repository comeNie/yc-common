package com.ai.yc.common.api.sysbasic.param;

import java.io.Serializable;

public class SaveSysBasic implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 编码ID
	 */
	private String id;
	/**
	 * 普通会员等级值
	 */
    private Integer ordinayryMember;
    /**
	 * 黄金会员等级值
	 */
    private Integer goldMember;
    /**
	 * 白金会员等级值
	 */
    private Integer platinumMember;
    /**
	 * 钻石会员等级值
	 */
    private Integer masonyMember;
    /**
	 * 封顶值
	 */
    private Integer capValue;
    /**
	 * V1译员
	 */
    private Integer v1Points;
    /**
	 * V2译员
	 */
    private Integer v2Points;
    /**
	 * V3译员
	 */
    private Integer v3Points;
    /**
	 * lsp团队
	 */
    private Integer lspPoints;
    /**
	 * 语料数
	 */
    private Integer lgdateNum;
    /**
	 * 客户数
	 */
    private Integer customNum;
    /**
	 * 译员数
	 */
    private Integer interpreterNum;
    /**
	 * 订单数
	 */
    private Integer orderNum;
    /**
	 * 语种数
	 */
    private Integer languageNum;
    /**
     * PC端首页公告
     */
    private String pcNotice;
    /**
     * wap端首页公告
     */
    private String wapNotice;
    
    /**
     * 签到送积分ID
     */
    private String did;
    /**
     * 连续1日送积分数
     */
    private Integer oneDay;
    /**
     * 连续2日送积分数
     */
    private Integer twoDay;
    /**
     * 连续3日送积分数
     */
    private Integer threeDay;
    /**
     * 连续4日送积分数
     */
    private Integer fourDay;
    /**
     * 连续5日送积分数
     */
    private Integer fiveDay;
    /**
     * 连续6日送积分数
     */
    private Integer sixDay;
    /**
     * 连续7日送积分数
     */
    private Integer sevenDay;
    /**
     * 签到送积分状态
     */
    private String dstate;
    
    /**
     * 注册活动ID
     */
    private String aid;
    /**
     * 活动名称
     */
    private String activiceName;
    /**
     * 活动送值
     */
    private Integer activiceNum;
    /**
     * 活动状态
     */
    private String astate;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getOrdinayryMember() {
		return ordinayryMember;
	}
	public void setOrdinayryMember(Integer ordinayryMember) {
		this.ordinayryMember = ordinayryMember;
	}
	public Integer getGoldMember() {
		return goldMember;
	}
	public void setGoldMember(Integer goldMember) {
		this.goldMember = goldMember;
	}
	public Integer getPlatinumMember() {
		return platinumMember;
	}
	public void setPlatinumMember(Integer platinumMember) {
		this.platinumMember = platinumMember;
	}
	public Integer getMasonyMember() {
		return masonyMember;
	}
	public void setMasonyMember(Integer masonyMember) {
		this.masonyMember = masonyMember;
	}
	public Integer getCapValue() {
		return capValue;
	}
	public void setCapValue(Integer capValue) {
		this.capValue = capValue;
	}
	public Integer getV1Points() {
		return v1Points;
	}
	public void setV1Points(Integer v1Points) {
		this.v1Points = v1Points;
	}
	public Integer getV2Points() {
		return v2Points;
	}
	public void setV2Points(Integer v2Points) {
		this.v2Points = v2Points;
	}
	public Integer getV3Points() {
		return v3Points;
	}
	public void setV3Points(Integer v3Points) {
		this.v3Points = v3Points;
	}
	public Integer getLspPoints() {
		return lspPoints;
	}
	public void setLspPoints(Integer lspPoints) {
		this.lspPoints = lspPoints;
	}
	public Integer getLgdateNum() {
		return lgdateNum;
	}
	public void setLgdateNum(Integer lgdateNum) {
		this.lgdateNum = lgdateNum;
	}
	public Integer getCustomNum() {
		return customNum;
	}
	public void setCustomNum(Integer customNum) {
		this.customNum = customNum;
	}
	public Integer getInterpreterNum() {
		return interpreterNum;
	}
	public void setInterpreterNum(Integer interpreterNum) {
		this.interpreterNum = interpreterNum;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Integer getLanguageNum() {
		return languageNum;
	}
	public void setLanguageNum(Integer languageNum) {
		this.languageNum = languageNum;
	}
	public String getPcNotice() {
		return pcNotice;
	}
	public void setPcNotice(String pcNotice) {
		this.pcNotice = pcNotice;
	}
	public String getWapNotice() {
		return wapNotice;
	}
	public void setWapNotice(String wapNotice) {
		this.wapNotice = wapNotice;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public Integer getOneDay() {
		return oneDay;
	}
	public void setOneDay(Integer oneDay) {
		this.oneDay = oneDay;
	}
	public Integer getTwoDay() {
		return twoDay;
	}
	public void setTwoDay(Integer twoDay) {
		this.twoDay = twoDay;
	}
	public Integer getThreeDay() {
		return threeDay;
	}
	public void setThreeDay(Integer threeDay) {
		this.threeDay = threeDay;
	}
	public Integer getFourDay() {
		return fourDay;
	}
	public void setFourDay(Integer fourDay) {
		this.fourDay = fourDay;
	}
	public Integer getFiveDay() {
		return fiveDay;
	}
	public void setFiveDay(Integer fiveDay) {
		this.fiveDay = fiveDay;
	}
	public Integer getSixDay() {
		return sixDay;
	}
	public void setSixDay(Integer sixDay) {
		this.sixDay = sixDay;
	}
	public Integer getSevenDay() {
		return sevenDay;
	}
	public void setSevenDay(Integer sevenDay) {
		this.sevenDay = sevenDay;
	}
	public String getDstate() {
		return dstate;
	}
	public void setDstate(String dstate) {
		this.dstate = dstate;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getActiviceName() {
		return activiceName;
	}
	public void setActiviceName(String activiceName) {
		this.activiceName = activiceName;
	}
	public Integer getActiviceNum() {
		return activiceNum;
	}
	public void setActiviceNum(Integer activiceNum) {
		this.activiceNum = activiceNum;
	}
	public String getAstate() {
		return astate;
	}
	public void setAstate(String astate) {
		this.astate = astate;
	}
}
