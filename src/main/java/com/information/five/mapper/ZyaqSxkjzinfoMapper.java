package com.information.five.mapper;

import com.information.five.model.ZyaqSxkjzinfo;

import java.util.List;

public interface ZyaqSxkjzinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqSxkjzinfo record);

    int insertSelective(ZyaqSxkjzinfo record);

    ZyaqSxkjzinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqSxkjzinfo record);

    int updateByPrimaryKey(ZyaqSxkjzinfo record);

    /**
     * 获取所有空间票
     * @return
     */
    List<ZyaqSxkjzinfo> queryAll();

    /**
     * 查询最后一条
     * @return
     */
    ZyaqSxkjzinfo queryLast();
}