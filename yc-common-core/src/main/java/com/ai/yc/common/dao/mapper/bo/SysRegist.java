package com.ai.yc.common.dao.mapper.bo;

public class SysRegist {
    private String aid;

    private String activiceName;

    private Integer activiceNum;

    private String state;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getActiviceName() {
        return activiceName;
    }

    public void setActiviceName(String activiceName) {
        this.activiceName = activiceName == null ? null : activiceName.trim();
    }

    public Integer getActiviceNum() {
        return activiceNum;
    }

    public void setActiviceNum(Integer activiceNum) {
        this.activiceNum = activiceNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}