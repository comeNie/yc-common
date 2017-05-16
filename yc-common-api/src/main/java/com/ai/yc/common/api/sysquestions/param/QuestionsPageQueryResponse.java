package com.ai.yc.common.api.sysquestions.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author lenovo
 */
public class QuestionsPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<QuestionsPageVo> pageInfo;

	public PageInfo<QuestionsPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<QuestionsPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}
