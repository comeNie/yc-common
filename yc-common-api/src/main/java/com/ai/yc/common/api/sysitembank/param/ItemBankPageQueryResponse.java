package com.ai.yc.common.api.sysitembank.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author lenovo
 */
public class ItemBankPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<ItemBankPageVo> pageInfo;

	public PageInfo<ItemBankPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<ItemBankPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}
