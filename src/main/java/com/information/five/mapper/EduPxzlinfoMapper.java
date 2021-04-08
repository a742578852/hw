package com.information.five.mapper;

import com.information.five.model.EduPxzlinfo;

import java.util.List;

public interface EduPxzlinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EduPxzlinfo record);

    int insertSelective(EduPxzlinfo record);

    EduPxzlinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EduPxzlinfo record);

    int updateByPrimaryKey(EduPxzlinfo record);

    /**
     * 查询所有
     * @return
     */
    List<EduPxzlinfo> queryAll();
}