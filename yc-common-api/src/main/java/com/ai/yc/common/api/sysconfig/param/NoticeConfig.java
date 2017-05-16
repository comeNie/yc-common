package com.ai.yc.common.api.sysconfig.param;

import com.ai.opt.base.vo.BaseResponse;

/**
 * @Description: 通告配置
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午4:30:49 
 * @version V1.0
 */
public class NoticeConfig extends BaseResponse {
	private static final long serialVersionUID = 1L;
	/**
	 * pc端通告
	 */
	private String pcNotice;
	/**
	 * wap端通告
	 */
    private String wapNotice;
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
}
