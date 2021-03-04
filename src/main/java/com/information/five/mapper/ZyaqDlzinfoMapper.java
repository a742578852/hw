package com.information.five.mapper;

import com.information.five.model.ZyaqDlzinfo;

import java.util.List;

public interface ZyaqDlzinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqDlzinfo record);

    int insertSelective(ZyaqDlzinfo record);

    ZyaqDlzinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqDlzinfo record);

    int updateByPrimaryKey(ZyaqDlzinfo record);

    /**
     * 查询所有
     * @return
     */
    List<ZyaqDlzinfo> queryAll();

    /**
     * 查询最后
     * @return
     */
    ZyaqDlzinfo queryLast();


}