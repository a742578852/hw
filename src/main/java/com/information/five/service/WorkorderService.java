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

    /**
     * 动火票添加修改
     * @param db
     * @param zyaqDhzinfo
     * @return
     */
    int changeFireOrder(String db,ZyaqDhzinfo zyaqDhzinfo);

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

    /**
     * 修改添加高处票
     * @param db
     * @param zyaqGczinfo
     * @return
     */
    int changeHighOrder(String db,ZyaqGczinfo zyaqGczinfo);

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

    /**
     * 添加修改受限空间票
     * @param db
     * @param zyaqSxkjzinfo
     * @return
     */
    int changeSpaceOrder(String db,ZyaqSxkjzinfo zyaqSxkjzinfo);

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

    /**
     * 修改添加吊装作业票
     * @param db
     * @param zyaqDzzinfo
     * @return
     */
    int changeHoistingOrder(String db,ZyaqDzzinfo zyaqDzzinfo);

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

    /**
     * 修改添加临时用电
     * @param db
     * @param zyaqLsydzinfo
     * @return
     */
    int changeElectricOrder(String db,ZyaqLsydzinfo zyaqLsydzinfo);

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

    /**
     * 修改添加动土票
     * @param db
     * @param zyaqDtzinfo
     * @return
     */
    int changeSoilOrder(String db,ZyaqDtzinfo zyaqDtzinfo);

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

    /**
     * 盲板抽堵修改添加
     * @param db
     * @param zyaqMbcdzinfo
     * @return
     */
    int changeWallOrder(String db,ZyaqMbcdzinfo zyaqMbcdzinfo);

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

    /**
     * 修改添加作业票
     * @param db
     * @param zyaqDlzinfo
     */
    int changeBreakOrder(String db,ZyaqDlzinfo zyaqDlzinfo);


}
