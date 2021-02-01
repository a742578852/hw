package com.information.five.mapper;

import com.information.five.model.YhpcJcbxxinfo;

import java.util.List;

public interface YhpcJcbxxinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(YhpcJcbxxinfo record);

    int insertSelective(YhpcJcbxxinfo record);

    YhpcJcbxxinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(YhpcJcbxxinfo record);

    int updateByPrimaryKey(YhpcJcbxxinfo record);

    /**
     * 根据检查表id查询
     * @param jcbid
     * @return
     */
    List<YhpcJcbxxinfo> queryJcbxxByJcbid(Long jcbid);

    /**
     * 添加检查表详细
     * @param jcbxx
     * @return
     */
    int insertYhpcJcbxxinfo(List jcbxx);
}