package com.ai.yc.common.api.sysdomain.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author lenovo
 */
public class DomainPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<DomainPageVo> pageInfo;

	public PageInfo<DomainPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<DomainPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}
