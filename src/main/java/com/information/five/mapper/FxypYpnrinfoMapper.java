package com.information.five.mapper;

import com.information.five.model.FxypYpnrinfo;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 修改车间id
     * @param list
     * @return
     */
    int updateCjidByBzjid(@Param("list") List list,@Param("cjid") Long cjid);

    /**
     * 根据班组级id查询研判内容
     * @param date
     * @return
     */
    List<FxypYpnrinfo> queryYpnrByBzid(List list);

    /**
     * 修改公司id
     * @param list
     * @param gsid
     * @return
     */
    int updateYpnrByList(@Param("list") List list,@Param("gsid") Long gsid);



}