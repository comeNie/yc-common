package com.ai.yc.common.service.atom.sysquestions;


import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageVo;
import com.ai.yc.common.dao.mapper.bo.SysQuestionsWithBLOBs;

/**
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
public interface ISysQuestionsAtomSV {

	PageInfo<QuestionsPageVo> queryQuestionsPage(QuestionsPageQueryRequest param);

	Integer saveSysItemBank(SysQuestionsWithBLOBs sysQuestionsWithBLOBs);

	Integer updateSysQuestions(SysQuestionsWithBLOBs sysQuestionsWithBLOBs);

	Integer deleteSysQuestions(String qid);

	Integer queryQuestionsNumber(QuestionsPageQueryRequest param);
	

}
