package com.information.five.mapper;

import com.information.five.model.FxypYpnrinfo;

import java.util.List;

public interface FxypYpnrinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypYpnrinfo record);

    int insertSelective(FxypYpnrinfo record);

    FxypYpnrinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypYpnrinfo record);

    int updateByPrimaryKey(FxypYpnrinfo record);

    /**
     * 获取研判内容根据班组级id
     * @param id
     * @return
     */
    List<FxypYpnrinfo> queryYpnrinfoByBid(Long bid);
}