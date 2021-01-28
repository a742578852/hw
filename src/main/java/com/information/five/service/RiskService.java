package com.information.five.service;

import com.information.five.model.FxbsFxsbinfo;
import com.information.five.model.YhpcYhzgdinfo;

import java.util.List;

public interface RiskService {

    /**
     * 添加风险上报
     * @param fxbsFxsbinfo
     * @return
     */
    int addFxsbInfo(FxbsFxsbinfo fxbsFxsbinfo,String db);



    /**
     * 获取所有风险上报
     * @param db
     * @return
     */
    List<FxbsFxsbinfo> getRisksAll(String db);

    /**
     * 查看风险信息
     * @param db
     * @param riskId
     * @return
     */
    FxbsFxsbinfo getFxbsFxsbinfoById(String db,Long riskId);

    /**
     * 获取风险上报相关隐患
     * @param db
     * @param riskid
     * @return
     */
    List<YhpcYhzgdinfo> getYhzgdinfoByRiskId(String db,Long riskid);

    /**
     * 获取最后一条隐患整改信息
     * @param db
     * @return
     */
    YhpcYhzgdinfo getLastYhzginfo(String db);

    /**
     * 新增隐患整改
     * @param db
     * @param yhpcYhzgdinfo
     * @return
     */
    int addYhzgdinfo(String db,YhpcYhzgdinfo yhpcYhzgdinfo);

    /**
     * 根据id查询隐患单详情
     * @param db
     * @param id
     * @return
     */
    YhpcYhzgdinfo getDangerDetail(String db,Long id);



}
