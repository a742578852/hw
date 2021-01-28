package com.information.five.mapper;

import com.information.five.model.FxypAqcninfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FxypAqcninfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypAqcninfo record);

    int insertSelective(FxypAqcninfo record);

    FxypAqcninfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypAqcninfo record);

    int updateByPrimaryKey(FxypAqcninfo record);

    /**
     * 根据班组级id获取承诺信息
     * @param bid
     * @return
     */
    FxypAqcninfo getAqcninfoByBzjid(Long bid);

    /**
     * 根据承诺
     * @param date
     * @param cj
     * @return
     */
    List<FxypAqcninfo> getAqcnByList(List list);

    /**
     * 修改公司id
     * @param list
     * @param gsid
     * @return
     */
    int updateGsidByList(@Param("list") List list, @Param("gsid") Long gsid);


}