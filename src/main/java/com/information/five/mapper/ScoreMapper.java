package com.information.five.mapper;

import com.information.five.model.Score;

import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    /**
     * h获取我的考试
     * @param xm
     * @return
     */
    List<Score> getScoreByUsername(String xm);
}