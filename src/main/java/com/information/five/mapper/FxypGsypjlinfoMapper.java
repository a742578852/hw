package com.information.five.mapper;

import com.information.five.model.FxypGsypjlinfo;

public interface FxypGsypjlinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypGsypjlinfo record);

    int insertSelective(FxypGsypjlinfo record);

    FxypGsypjlinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypGsypjlinfo record);

    int updateByPrimaryKey(FxypGsypjlinfo record);
}