package com.information.five.mapper;

import com.information.five.model.ZyaqMbcdzinfo;

import java.util.List;

public interface ZyaqMbcdzinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqMbcdzinfo record);

    int insertSelective(ZyaqMbcdzinfo record);

    ZyaqMbcdzinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqMbcdzinfo record);

    int updateByPrimaryKey(ZyaqMbcdzinfo record);

    /**
     * 查询所有
     * @return
     */
    List<ZyaqMbcdzinfo> queryAll();

    /**
     * 查询最后
     * @return
     */
    ZyaqMbcdzinfo queryLast();
}