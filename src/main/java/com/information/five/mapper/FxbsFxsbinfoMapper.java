package com.information.five.mapper;

import com.information.five.model.FxbsFxsbinfo;

import java.util.List;

public interface FxbsFxsbinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxbsFxsbinfo record);

    int insertSelective(FxbsFxsbinfo record);

    FxbsFxsbinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxbsFxsbinfo record);

    int updateByPrimaryKey(FxbsFxsbinfo record);

    /**
     * 获取所有风险上报信息
     * @return
     */
    List<FxbsFxsbinfo> queryFxsbinfoAll();
}