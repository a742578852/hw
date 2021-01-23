package com.information.five.mapper;

import com.information.five.model.Question;
import com.information.five.model.Score;
import com.information.five.model.Subject;

import java.util.List;

public interface SubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);

    List<Subject> queryAll();

    /**
     * 根据用户名查询我的考试
     * @param username
     * @return
     */
    List<Score> queryScoreByUsername(String username);


}