package com.information.five.mapper;

import com.information.five.model.FxypAqcninfo;

public interface FxypAqcninfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypAqcninfo record);

    int insertSelective(FxypAqcninfo record);

    FxypAqcninfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypAqcninfo record);

    int updateByPrimaryKey(FxypAqcninfo record);

    /**
     * 根据班组级id获取承诺信息
     * @param bid
     * @return
     */
    FxypAqcninfo getAqcninfoByBzjid(Long bid);


}