package com.ai.yc.common.api.sysbasic.param;

import java.io.Serializable;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
public class SysBasicVo implements Serializable {
	private static final long serialVersionUID = 8905046796009076587L;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
}
