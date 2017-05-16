package com.ai.yc.common.api.sysquestions.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.yc.common.api.sysquestions.interfaces.IQuerySysQuestionsSV;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryResponse;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageVo;
import com.ai.yc.common.service.business.sysquestions.IQuerySysQuestionsBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
@Component
public class QuerySysQuestionsSVImpl implements IQuerySysQuestionsSV {
	
	@Autowired
	private transient IQuerySysQuestionsBusiSV iQuerySysQuestionsBusiSV;


	@Override
	public QuestionsPageQueryResponse queryQuestionsPage(QuestionsPageQueryRequest param)
			throws BusinessException, SystemException {
		
		QuestionsPageQueryResponse questionsPageQueryResponse = new QuestionsPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<QuestionsPageVo> pageInfo = iQuerySysQuestionsBusiSV.queryQuestionsPage(param);
            questionsPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setIsSuccess(true);
            responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
            responseHeader.setResultMessage("题目查询成功");
            questionsPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            questionsPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptCodeConstants.Special.SYSTEM_ERROR);
            responseHeader.setResultMessage("题目查询失败");
            questionsPageQueryResponse.setResponseHeader(responseHeader);
        }
		return questionsPageQueryResponse;
	}
}
