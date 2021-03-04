package com.information.five.mapper;

import com.information.five.model.ZyaqGczinfo;

import java.util.List;

public interface ZyaqGczinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqGczinfo record);

    int insertSelective(ZyaqGczinfo record);

    ZyaqGczinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqGczinfo record);

    int updateByPrimaryKey(ZyaqGczinfo record);

    /**
     * 获取所有登高作业票
     * @return
     */
    List<ZyaqGczinfo> queryAll();

    /**
     * 获取登高最后一条
     * @return
     */
    ZyaqGczinfo queryLast();

}