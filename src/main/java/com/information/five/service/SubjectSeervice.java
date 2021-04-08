package com.information.five.service;

import com.information.five.model.*;

import java.util.List;
import java.util.Map;

public interface SubjectSeervice {

    /**
     * 获取所有科目
     * @return
     */
    List<Subject> queryAll(String tb);
    /**
     * 获取当前科目所有题数
     */
    int queryTopicCount(String questionName,String tb);

    /**
     * 获取当前科目学习记录数
     *
     */
    int queryStudyCount(String subjectName,String userName,String tb);

    /**
     * 添加学习记录
     * @param questionId
     * @param db
     * @return
     */
    int insertStudyInfo(Long questionId, SystemAdmin systemAdmin,String db);

    /**
     * 查询当前题目和人员有没有学习记录
     * @param db
     * @param quertionId
     * @param systemAdmin
     * @return
     */
    int queryStudyInfo(String db,Long quertionId,SystemAdmin systemAdmin);

    /**
     * 获取当前科目所有题目和学习状态
     * @param tb
     * @param subjectName
     * @param username
     * @return
     */
    List<Question> getQuestion(String tb, Long subjectId, String username);

    /**
     * 获取我的考试
     * @param db
     * @param systemAdmin
     * @return
     */
    List<Score> getScore(String db,SystemAdmin systemAdmin);

    /**
     * 获取我的试题信息
     * @param db
     * @param scoreId
     * @return
     */
    Map getquestions(String db,Long scoreId);

    /**
     * 批改试卷
     * @param db
     * @param answer
     * @param scoreId
     * @return
     */
    int markingExam(String db,String answer,Long scoreId);

    /**
     * 查询所有培训资料
     * @param db
     * @return
     */
    List<EduPxzlinfo> getTrainingMaterials(String db);

}
