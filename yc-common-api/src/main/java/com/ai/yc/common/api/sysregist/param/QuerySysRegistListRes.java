package com.ai.yc.common.api.sysregist.param;


import com.ai.opt.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0.1
 */
public class QuerySysRegistListRes extends BaseResponse{

	private static final long serialVersionUID = 1L;
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
