package com.information.five.mapper;

import com.information.five.model.FxypCjypjlinfo;

import java.util.List;

public interface FxypCjypjlinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypCjypjlinfo record);

    int insertSelective(FxypCjypjlinfo record);

    FxypCjypjlinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypCjypjlinfo record);

    int updateByPrimaryKey(FxypCjypjlinfo record);

    /**
     * 获取车间研判记录
     * @return
     */
    List<FxypCjypjlinfo> queryCjInfo();

    /**
     * 根据时间查询车间研判记录
     * @param date
     * @return
     */
    List<FxypCjypjlinfo> queryCjinfoByDate(String date);
}