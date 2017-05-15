package com.ai.yc.common.dao.mapper.bo;

public class SysJf {
    private String did;

    private Integer oneDay;

    private Integer twoDay;

    private Integer threeDay;

    private Integer fourDay;

    private Integer fiveDay;

    private Integer sixDay;

    private Integer sevenDay;

    private String state;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did == null ? null : did.trim();
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}