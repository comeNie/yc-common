package com.ai.yc.common.api.sysjf.param;

import java.io.Serializable;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
public class SysJfVo implements Serializable {
	private static final long serialVersionUID = 8905046796009076587L;

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
}
