package com.information.five.mapper;

import com.information.five.model.ZyaqDtzinfo;

import java.util.List;

public interface ZyaqDtzinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqDtzinfo record);

    int insertSelective(ZyaqDtzinfo record);

    ZyaqDtzinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqDtzinfo record);

    int updateByPrimaryKey(ZyaqDtzinfo record);

    /**
     * 查询所有
     * @return
     */
    List<ZyaqDtzinfo> queryAll();
}