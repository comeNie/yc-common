package com.ai.yc.common.api.sysregist.param;

import java.io.Serializable;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
public class SysRegistVo implements Serializable {
	private static final long serialVersionUID = 8905046796009076587L;

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
