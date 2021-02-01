package com.information.five.service;

import com.information.five.model.*;
import com.information.five.util.Result;

import java.util.List;

public interface WorkorderService {


    /**
     * 获取所有动火作业票
     * @param db
     * @return
     */
    List getFireorderList(String db);


    /**
     * 获取动火票详情
     * @param db
     * @param orderId
     * @return
     */
    ZyaqDhzinfo getFireorderDetail(String db, Long orderId);

    //----------------------------------------------------------------------

    /**
     * 获取登高票列表
     * @param db
     * @return
     */
    List getHighorderList(String db);

    /**
     * 获取高处票详情
     * @param db
     * @param orderid
     * @return
     */
    ZyaqGczinfo getHighorderDetail(String db, Long orderid);

    //--------------------------------------------------------------

    /**
     * 获取受限空间列表
     * @param db
     * @return
     */
    List getSpaceorderList(String db);

    /**
     * 获取受限空间详情
     * @param db
     * @param orderId
     * @return
     */
    ZyaqSxkjzinfo getSpaceorderDetail(String db, Long orderId);

    //------------------------------------------------------------------

    /**
     * 获取吊装作业列表
     * @param db
     * @return
     */
    List getHoistingordrList(String db);

    /**
     * 获取吊装作业票详情
     * @param db
     * @param orderId
     * @return
     */
    ZyaqDzzinfo getHoistingorderDetail(String db,Long orderId);

    //------------------------------------------------------------------------

    /**
     * 获取临时用电列表
     * @param db
     * @return
     */
    public List getelectricorderList(String db);

    /**
     * 获取临时用电详情
     * @param db
     * @param orderId
     * @return
     */
    ZyaqLsydzinfo getelectricorderDetail(String db, Long orderId);

    //-----------------------------------------------------------------------

    /**
     * 获取动土列表
     * @param db
     * @return
     */
    List getSoilorderList(String db);

    /**
     * 获取动土详情
     * @param db
     * @param orderId
     * @return
     */
    ZyaqDtzinfo getSoilorderDetail(String db,Long orderId);

    //--------------------------------------------------------------------
    //获取盲板抽堵列表
    List getWallorderList(String db);


    /**
     * 盲堵抽板详情
     * @param db
     * @param orderId
     * @return
     */
    ZyaqMbcdzinfo getWallorderDetail(String db,Long orderId);

    //------------------------------------------------------------------

    /**
     * 断路列表
     * @param db
     * @return
     */
    List getBreakorderList(String db);

    /**
     * 获取断路票详情
     * @param db
     * @param orderid
     * @return
     */
    ZyaqDlzinfo getBreakorderDetail(String db,Long orderid);


}
