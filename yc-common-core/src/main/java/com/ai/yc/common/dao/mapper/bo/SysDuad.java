package com.ai.yc.common.dao.mapper.bo;

public class SysDuad {
    private String duadId;

    private String language;

    private String site;

    private String orderType;

    private String sourceCn;

    private String sourceEn;

    private String targetCn;

    private String targetEn;

    private String ordinary;

    private String ordinaryUrgent;

    private String professional;

    private String professionalUrgent;

    private String publish;

    private String publishUrgent;

    private String sort;

    private String state;

    private String currency;

    public String getDuadId() {
        return duadId;
    }

    public void setDuadId(String duadId) {
        this.duadId = duadId == null ? null : duadId.trim();
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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getSourceCn() {
        return sourceCn;
    }

    public void setSourceCn(String sourceCn) {
        this.sourceCn = sourceCn == null ? null : sourceCn.trim();
    }

    public String getSourceEn() {
        return sourceEn;
    }

    public void setSourceEn(String sourceEn) {
        this.sourceEn = sourceEn == null ? null : sourceEn.trim();
    }

    public String getTargetCn() {
        return targetCn;
    }

    public void setTargetCn(String targetCn) {
        this.targetCn = targetCn == null ? null : targetCn.trim();
    }

    public String getTargetEn() {
        return targetEn;
    }

    public void setTargetEn(String targetEn) {
        this.targetEn = targetEn == null ? null : targetEn.trim();
    }

    public String getOrdinary() {
        return ordinary;
    }

    public void setOrdinary(String ordinary) {
        this.ordinary = ordinary == null ? null : ordinary.trim();
    }

    public String getOrdinaryUrgent() {
        return ordinaryUrgent;
    }

    public void setOrdinaryUrgent(String ordinaryUrgent) {
        this.ordinaryUrgent = ordinaryUrgent == null ? null : ordinaryUrgent.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getProfessionalUrgent() {
        return professionalUrgent;
    }

    public void setProfessionalUrgent(String professionalUrgent) {
        this.professionalUrgent = professionalUrgent == null ? null : professionalUrgent.trim();
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public String getPublishUrgent() {
        return publishUrgent;
    }

    public void setPublishUrgent(String publishUrgent) {
        this.publishUrgent = publishUrgent == null ? null : publishUrgent.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }
}