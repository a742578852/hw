package com.information.five.mapper;

import com.information.five.model.YhpcJcxminfo;

import java.util.List;

public interface YhpcJcxminfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(YhpcJcxminfo record);

    int insertSelective(YhpcJcxminfo record);

    YhpcJcxminfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(YhpcJcxminfo record);

    int updateByPrimaryKey(YhpcJcxminfo record);

    /**
     * 根据检查记录id获取检查项目
     * @param jcjlid
     * @return
     */
    List<YhpcJcxminfo> getJcxmByjlid(Long jcjlid);
}