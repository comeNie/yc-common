package com.ai.platform.common.dao.mapper.bo;

public class SysPurpose {
    private String purposeId;

    private String language;

    private String site;

    private String purposeCn;

    private String purposeEn;

    private String remarks;

    private String sort;

    private String state;

    private String namedFlag;

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
        this.purposeCn = purposeCn == null ? null : purposeCn.trim();
    }

    public String getPurposeEn() {
        return purposeEn;
    }

    public void setPurposeEn(String purposeEn) {
        this.purposeEn = purposeEn == null ? null : purposeEn.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public String getNamedFlag() {
        return namedFlag;
    }

    public void setNamedFlag(String namedFlag) {
        this.namedFlag = namedFlag == null ? null : namedFlag.trim();
    }
}