package com.information.five.mapper;

import com.information.five.model.ZyaqDzzinfo;

import java.util.List;

public interface ZyaqDzzinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqDzzinfo record);

    int insertSelective(ZyaqDzzinfo record);

    ZyaqDzzinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqDzzinfo record);

    int updateByPrimaryKey(ZyaqDzzinfo record);

    /**
     * 查询所有
     * @return
     */
    List<ZyaqDzzinfo> queryAll();
}