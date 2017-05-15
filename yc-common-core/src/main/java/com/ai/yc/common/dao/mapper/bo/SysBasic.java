package com.ai.yc.common.dao.mapper.bo;

public class SysBasic {
    private String id;

    private Integer ordinayryMember;

    private Integer goldMember;

    private Integer platinumMember;

    private Integer masonyMember;

    private Integer capValue;

    private Integer v1Points;

    private Integer v2Points;

    private Integer v3Points;

    private Integer lspPoints;

    private Integer lgdateNum;

    private Integer customNum;

    private Integer interpreterNum;

    private Integer orderNum;

    private Integer languageNum;

    private String pcNotice;

    private String wapNotice;

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

    public String getPcNotice() {
        return pcNotice;
    }

    public void setPcNotice(String pcNotice) {
        this.pcNotice = pcNotice == null ? null : pcNotice.trim();
    }

    public String getWapNotice() {
        return wapNotice;
    }

    public void setWapNotice(String wapNotice) {
        this.wapNotice = wapNotice == null ? null : wapNotice.trim();
    }
}