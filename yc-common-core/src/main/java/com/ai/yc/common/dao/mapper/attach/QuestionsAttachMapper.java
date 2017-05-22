package com.ai.yc.common.dao.mapper.attach;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import com.ai.yc.common.api.sysquestions.param.QuestionsPapersVo;
import com.ai.yc.common.dao.mapper.bo.SysQuestionsWithBLOBs;
public interface QuestionsAttachMapper {

   
	@Select("SELECT qid,choice_question,optionA,optionB,optionC,optionD from sys_questions where bid = #{bid} and qtype = '0' and status = '1' order By Rand() Limit 10")
	@ResultMap("com.ai.yc.common.dao.mapper.interfaces.SysQuestionsMapper.BaseResultMap")
	public List<QuestionsPapersVo> getQuestionsChoicePapers(@Param("bid") String bid);
	@Select("SELECT qid,original from sys_questions where bid = #{bid} and qtype = '1' and status = '1' order By Rand() Limit 1")
	@ResultMap("com.ai.yc.common.dao.mapper.interfaces.SysQuestionsMapper.ResultMapWithBLOBs")
	public SysQuestionsWithBLOBs questionsPapers(@Param("bid") String bid);
}
