package com.information.five.mapper;

import com.information.five.model.YhpcYhzgdinfo;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据日期查询隐患信息
     * @param date
     * @return
     */
    List<YhpcYhzgdinfo> queryZgdinfoByDate(String date);

    /**
     * 根据区域查询隐患统计
     * @return
     */
    List<Map> queryZgdinfoByArea();

    /**
     * 根据类别获取隐患统计
     * @return
     */
    List<Map> queryZgadinfoByClass();
}