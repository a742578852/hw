package com.information.five.mapper;

import com.information.five.model.ZyaqLsydzinfo;

import java.util.List;

public interface ZyaqLsydzinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqLsydzinfo record);

    int insertSelective(ZyaqLsydzinfo record);

    ZyaqLsydzinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqLsydzinfo record);

    int updateByPrimaryKey(ZyaqLsydzinfo record);

    /**
     * 获取临时用电列表
     * @return
     */
    List<ZyaqLsydzinfo> queryAll();

    /**
     * 临时用电最后一条
     * @return
     */
    ZyaqLsydzinfo queryLast();
}