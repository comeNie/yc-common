package com.ai.yc.common.service.business.sysquestions;


import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageVo;

/**
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
public interface IQuerySysQuestionsBusiSV {

	PageInfo<QuestionsPageVo> queryQuestionsPage(QuestionsPageQueryRequest param);


}
