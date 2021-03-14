package com.information.five.mapper;

import com.information.five.model.SystemDictionary;

import java.util.List;

public interface SystemDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemDictionary record);

    int insertSelective(SystemDictionary record);

    SystemDictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemDictionary record);

    int updateByPrimaryKey(SystemDictionary record);

    /**
     * 根据code查询字典
     * @param code
     * @return
     */
    List<SystemDictionary> queryDictionaryByCode(String code);
}