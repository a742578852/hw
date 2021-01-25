package com.information.five.service;

import com.information.five.model.FxypAqcninfo;
import com.information.five.model.FxypBzjinfo;
import com.information.five.model.FxypYpnrinfo;

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
    int addOrUpdateJudge(String db, FxypBzjinfo fxypBzjinfo, FxypYpnrinfo fxypYpnrinfo, FxypAqcninfo fxypAqcninfo);
}
