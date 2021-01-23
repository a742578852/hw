package com.information.five.mapper;

import com.information.five.model.EduStudyinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EduStudyinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduStudyinfo record);

    int insertSelective(EduStudyinfo record);

    EduStudyinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EduStudyinfo record);

    int updateByPrimaryKey(EduStudyinfo record);

    /**
     * 查询学习数根据科目名和用户名
     * @param kmmc
     * @param xm
     * @return
     */
    int querystudyInfoByKmAndUsername(@Param("kmmc") String kmmc, @Param("xm") String xm);

    /**
     * 查询我的学习记录
     * @param xm
     * @return
     */
    List<EduStudyinfo> queryStydyByXm(String xm);

    /**
     * 查询当前题目和人员有没有学习记录
     * @param questionid
     * @param xm
     * @return
     */
    int queryStudyByQuestinidAndUsername(@Param("questionid") Long questionid,@Param("xm") String xm);


}