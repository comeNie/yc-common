package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysQuestions;
import com.ai.yc.common.dao.mapper.bo.SysQuestionsCriteria;
import com.ai.yc.common.dao.mapper.bo.SysQuestionsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysQuestionsMapper {
    int countByExample(SysQuestionsCriteria example);

    int deleteByExample(SysQuestionsCriteria example);

    int insert(SysQuestionsWithBLOBs record);

    int insertSelective(SysQuestionsWithBLOBs record);

    List<SysQuestionsWithBLOBs> selectByExampleWithBLOBs(SysQuestionsCriteria example);

    List<SysQuestions> selectByExample(SysQuestionsCriteria example);

    int updateByExampleSelective(@Param("record") SysQuestionsWithBLOBs record, @Param("example") SysQuestionsCriteria example);

    int updateByExampleWithBLOBs(@Param("record") SysQuestionsWithBLOBs record, @Param("example") SysQuestionsCriteria example);

    int updateByExample(@Param("record") SysQuestions record, @Param("example") SysQuestionsCriteria example);
}