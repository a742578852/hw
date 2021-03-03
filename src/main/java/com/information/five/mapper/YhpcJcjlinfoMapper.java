package com.information.five.mapper;

import com.information.five.model.YhpcJcjlinfo;

import java.util.List;

public interface YhpcJcjlinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(YhpcJcjlinfo record);

    int insertSelective(YhpcJcjlinfo record);

    YhpcJcjlinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(YhpcJcjlinfo record);

    int updateByPrimaryKey(YhpcJcjlinfo record);

    /**
     * 查询全部
     * @return
     */
    List<YhpcJcjlinfo> queryAll();

    /**
     * 查询最后一条
     * @return
     */
    YhpcJcjlinfo queryLast();
}