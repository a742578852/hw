package com.information.five.mapper;

import com.information.five.model.FxypBzjinfo;

import java.util.List;

public interface FxypBzjinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypBzjinfo record);

    int insertSelective(FxypBzjinfo record);

    FxypBzjinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypBzjinfo record);

    int updateByPrimaryKey(FxypBzjinfo record);

    /**
     * 获取所有班组级研判
     * @return
     */
    List<FxypBzjinfo> queryBzjinfo();
}