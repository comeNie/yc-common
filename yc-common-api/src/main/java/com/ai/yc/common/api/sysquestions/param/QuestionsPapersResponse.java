package com.ai.yc.common.api.sysquestions.param;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
/**
 *	生产试卷出参
 * @author lenovo
 */
public class QuestionsPapersResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String qid;
	/**
	 * 原文
	 */
	private String original;
	
	private List<QuestionsPapersVo> qiestionsParpersVoList = null;

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public List<QuestionsPapersVo> getQiestionsParpersVoList() {
		return qiestionsParpersVoList;
	}

	public void setQiestionsParpersVoList(List<QuestionsPapersVo> qiestionsParpersVoList) {
		this.qiestionsParpersVoList = qiestionsParpersVoList;
	}
}
