package com.information.five.mapper;

import com.information.five.model.ZyaqDhzinfo;

import java.util.List;

public interface ZyaqDhzinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqDhzinfo record);

    int insertSelective(ZyaqDhzinfo record);

    ZyaqDhzinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqDhzinfo record);

    int updateByPrimaryKey(ZyaqDhzinfo record);

    /**
     * 获取所有作业票
     * @return
     */
    List<ZyaqDhzinfo> queryAll();

    /**
     * 获取最后一张动火
     * @return
     */
    ZyaqDhzinfo queryLastDh();
}