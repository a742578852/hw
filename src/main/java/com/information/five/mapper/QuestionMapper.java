package com.information.five.mapper;

import com.information.five.model.Question;

import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);

    /**
     * 根据科目名获取题数
     * @param subject
     * @return
     */
    int queryQuestionByKmmc(String subject);

    /**
     *根据科目名称获取所有题目
     * @param kmmc
     * @return
     */
    List<Question> queryQuestionByKm(String kmmc);

    /**
     * 根据id集合获取所有题目
     * @param list
     * @return
     */
    List<Question> queryQusetinById(String[] list);


}