package com.information.five.mapper;

import com.information.five.model.FxypGsypjlinfo;

import java.util.List;

public interface FxypGsypjlinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypGsypjlinfo record);

    int insertSelective(FxypGsypjlinfo record);

    FxypGsypjlinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypGsypjlinfo record);

    int updateByPrimaryKey(FxypGsypjlinfo record);

    /**
     * 根据时间查询公司研判信息
     * @param date
     * @return
     */
    FxypGsypjlinfo queryGsinfo(String date);

    /**
     * 获取所有公司研判
     * @return
     */
    List<FxypGsypjlinfo> queryAllGsinfo();
}