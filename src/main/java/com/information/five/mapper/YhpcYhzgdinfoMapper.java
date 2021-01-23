package com.information.five.mapper;

import com.information.five.model.YhpcYhzgdinfo;

import java.util.List;

public interface YhpcYhzgdinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(YhpcYhzgdinfo record);

    int insertSelective(YhpcYhzgdinfo record);

    YhpcYhzgdinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(YhpcYhzgdinfo record);

    int updateByPrimaryKey(YhpcYhzgdinfo record);

    /**
     * 查询风险上报相关的隐患整改单
     * @param riskid
     * @return
     */
    List<YhpcYhzgdinfo> queryYhzgdinfoByRiskid(Long riskid);

    /**
     * 获取最后一条隐患信息
     * @return
     */
    YhpcYhzgdinfo queryLatYhzg();
}