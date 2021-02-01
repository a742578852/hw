package com.information.five.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface StacService {
    /**
     * 根据年查询这一年所有的隐患统计信息
     * @param db
     * @param year
     * @return
     */
    Map getDangerStacByComrate(String db,String year) throws ParseException;

    /**
     * 根据区域获取统计信息
     * @return
     */
    List getDangerByArea(String db);

    /**
     * 根据分类获取隐患统计
     * @param db
     * @return
     */
    List getDangerByClass(String db);

}
