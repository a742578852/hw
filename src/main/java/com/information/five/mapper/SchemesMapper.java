package com.information.five.mapper;

import com.information.five.model.Schemes;

import java.util.List;

public interface SchemesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Schemes record);

    int insertSelective(Schemes record);

    Schemes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Schemes record);

    int updateByPrimaryKey(Schemes record);

    /**
     * 根据
     * @param sjmcid
     * @return
     */
    List<Schemes> querySchemesBySjmcid(Long sjmcid);
}