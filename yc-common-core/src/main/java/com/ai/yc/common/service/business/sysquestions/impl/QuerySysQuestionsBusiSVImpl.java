package com.ai.yc.common.service.business.sysquestions.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageVo;
import com.ai.yc.common.service.atom.sysquestions.ISysQuestionsAtomSV;
import com.ai.yc.common.service.business.sysquestions.IQuerySysQuestionsBusiSV;

/**
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
public class QuerySysQuestionsBusiSVImpl implements IQuerySysQuestionsBusiSV {
	
	@Autowired 
	private transient ISysQuestionsAtomSV  iSysQuestionsAtomSV;


	@Override
	public PageInfo<QuestionsPageVo> queryQuestionsPage(QuestionsPageQueryRequest param) {
		PageInfo<QuestionsPageVo> questionsPageInfo = iSysQuestionsAtomSV.queryQuestionsPage(param);
		return questionsPageInfo;
	}
}
