package com.information.five.service;

import com.information.five.model.FxbsFxsbinfo;
import com.information.five.model.YhpcJcbinfo;
import com.information.five.model.YhpcJcbxxinfo;
import com.information.five.model.YhpcYhzgdinfo;

import java.util.List;
import java.util.Map;

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


    /**
     * 获取安全检查记录
     * @return
     */
    List getCheckrecord(String db);


    /**
     * 获取安全检查记录详情
     * @return
     */
    Map getCheckRecordDetail(String db,Long id);


    /**
     * 获取检查表
     * @return
     */
    List getCheckForm(String db);


    /**
     * 获取检查表详细项目
     * @param db
     * @param formId
     * @return
     */
    List getCheckFormDetail(String db,Long formId);

    /**
     * 新增检查记录
     * @param db
     * @param yhpcJcbinfo
     * @param yhpcJcbxxinfos
     * @return
     */
    int addCheckRecord(String db, YhpcJcbinfo yhpcJcbinfo, List<YhpcJcbxxinfo> yhpcJcbxxinfos);
}
