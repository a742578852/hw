package com.information.five.mapper;

import com.information.five.model.YhpcJcbinfo;

import java.util.List;

public interface YhpcJcbinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(YhpcJcbinfo record);

    int insertSelective(YhpcJcbinfo record);

    YhpcJcbinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(YhpcJcbinfo record);

    int updateByPrimaryKey(YhpcJcbinfo record);

    /**
     * 获取全部检查表
     * @return
     */
    List<YhpcJcbinfo> queryAll();
}