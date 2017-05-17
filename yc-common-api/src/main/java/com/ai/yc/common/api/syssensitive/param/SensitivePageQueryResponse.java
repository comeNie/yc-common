package com.ai.yc.common.api.syssensitive.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author lenovo
 */
public class SensitivePageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<SensitivePageVo> pageInfo;

	public PageInfo<SensitivePageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SensitivePageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
