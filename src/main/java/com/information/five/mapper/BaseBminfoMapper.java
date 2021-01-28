package com.information.five.mapper;

import com.information.five.model.BaseBminfo;

import java.util.List;

public interface BaseBminfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseBminfo record);

    int insertSelective(BaseBminfo record);

    BaseBminfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseBminfo record);

    int updateByPrimaryKey(BaseBminfo record);

    /**
     * 查询所有部门
     * @return
     */
    List<BaseBminfo> queryAll();
}