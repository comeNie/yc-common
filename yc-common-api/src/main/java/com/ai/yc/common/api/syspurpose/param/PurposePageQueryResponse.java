package com.ai.yc.common.api.syspurpose.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author lenovo
 */
public class PurposePageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<PurposePageVo> pageInfo;

	public PageInfo<PurposePageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<PurposePageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}
