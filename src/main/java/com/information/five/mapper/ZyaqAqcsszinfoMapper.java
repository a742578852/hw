package com.information.five.mapper;

import com.information.five.model.ZyaqAqcsszinfo;

import java.util.List;

public interface ZyaqAqcsszinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZyaqAqcsszinfo record);

    int insertSelective(ZyaqAqcsszinfo record);

    ZyaqAqcsszinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZyaqAqcsszinfo record);

    int updateByPrimaryKey(ZyaqAqcsszinfo record);

    /**
     * 获取所有安全措施
     * @return
     */
    List<ZyaqAqcsszinfo> queryAll(String orderName);
}