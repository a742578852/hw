package com.information.five.mapper;

import com.information.five.model.FxypBzjinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FxypBzjinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FxypBzjinfo record);

    int insertSelective(FxypBzjinfo record);

    FxypBzjinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FxypBzjinfo record);

    int updateByPrimaryKey(FxypBzjinfo record);

    /**
     * 获取所有班组级研判
     * @return
     */
    List<FxypBzjinfo> queryBzjinfo();

    /**
     * 根据时间和部门查询
     */
    List<FxypBzjinfo> queryBzjinfoByDadeAndCj(@Param("date") String date, @Param("cj") String cj);

    /**
     * 获取班组级研判根据车间id
     * @param cjid
     * @return
     */
    List<FxypBzjinfo> queryBzjinfoByCjid(Long cjid);

    /**
     * 查询班组信息根据时间
     * @param date
     * @return
     */
    List<FxypBzjinfo> queryBzinfoByDate(String date);

    /**
     * 获取班组级研判根据公司id
     * @param cjid
     * @return
     */
    List<FxypBzjinfo> queryBzjinfoByGsid(Long gsid);


}