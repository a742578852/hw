package com.information.five.mapper;

import com.information.five.model.FxypCjypjlinfo;

public interface FxypCjypjlinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypCjypjlinfo record);

    int insertSelective(FxypCjypjlinfo record);

    FxypCjypjlinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypCjypjlinfo record);

    int updateByPrimaryKey(FxypCjypjlinfo record);
}