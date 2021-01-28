package com.information.five.service;

import com.information.five.model.*;
import com.information.five.util.Result;

import java.util.List;
import java.util.Map;

public interface JudgeService {

    /**
     * 获取所有研判
     */
    public List<FxypBzjinfo> getFxypinfo(String db);

    /**
     * 获取班组级研判和承诺信息
     * @return
     */
    Map getBzjInfos(Long bid,String db);


    /**
     * 风险研判信息添加或新增
     * @return
     */
    int addOrUpdateJudge(String db, FxypBzjinfo fxypBzjinfo, List<FxypYpnrinfo> fxypYpnrinfo, FxypAqcninfo fxypAqcninfo);

    /**
     * 车间汇总
     * @param db
     * @param date
     * @param cj
     * @param sbr
     * @return
     */
    Result summaryCjinfo(String db, String date, String cj, String sbr);


    /**
     * 获取车间研判记录
     * @param db
     * @return
     */
    List<FxypCjypjlinfo> getCjInfo(String db);

    /**
     * 获取车间研判记录详情
     * @return
     */
    Map getCjinfoDetail(String db,Long cjid);

    /**
     * 获取班组级研判详情
     * @param db
     * @param bzjid
     * @return
     */
    List<FxypYpnrinfo> getYpnrDetail(String db,Long bzjid);


    /**
     * 获取承诺详情
     * @param db
     * @param bzid
     * @return
     */
    FxypAqcninfo getCnDetail(String db,Long bzid);

    /**
     * 车间合并到公司
     * @param db
     * @param gsname
     * @param sbr
     * @param date
     * @return
     */
    Result mergeGsinfo(String db,String gsname,String sbr,String date);


    /**
     * 获取所有公司研判信息
     * @param db
     * @return
     */
    List<FxypGsypjlinfo> getAllGsinfo(String db);

    /**
     * 获取公司信息详情
     * @param db
     * @param gsid
     * @return
     */
    Map getGsinfoDetail(String db,Long gsid);
}
