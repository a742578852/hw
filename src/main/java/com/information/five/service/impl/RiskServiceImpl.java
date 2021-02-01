package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.information.five.mapper.*;
import com.information.five.model.*;
import com.information.five.service.RiskService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RiskServiceImpl implements RiskService {
    @Autowired
    FxbsFxsbinfoMapper fxbsFxsbinfoMapper;
    @Autowired
    YhpcYhzgdinfoMapper yhpcYhzgdinfoMapper;

    @Autowired
    YhpcJcjlinfoMapper yhpcJcjlinfoMapper;
    @Autowired
    YhpcJcxminfoMapper yhpcJcxminfoMapper;
    @Autowired
    YhpcJcbinfoMapper yhpcJcbinfoMapper;

    @Autowired
    YhpcJcbxxinfoMapper yhpcJcbxxinfoMapper;

    @Override
    @DS("#db")
    public int addFxsbInfo(FxbsFxsbinfo fxbsFxsbinfo,String db) {


        if (fxbsFxsbinfo.getId() == 0 || fxbsFxsbinfo.getId() == null){
            return fxbsFxsbinfoMapper.insertSelective(fxbsFxsbinfo);
        }else {
            return fxbsFxsbinfoMapper.updateByPrimaryKeySelective(fxbsFxsbinfo);
        }

    }

    @Override
    @DS("#db")
    public List<FxbsFxsbinfo> getRisksAll(String db) {

        return fxbsFxsbinfoMapper.queryFxsbinfoAll();
    }

    @Override
    @DS("#db")
    public FxbsFxsbinfo getFxbsFxsbinfoById(String db, Long riskId) {

        return fxbsFxsbinfoMapper.selectByPrimaryKey(riskId);
    }

    @Override
    @DS("#db")
    public List<YhpcYhzgdinfo> getYhzgdinfoByRiskId(String db, Long riskid) {

        return yhpcYhzgdinfoMapper.queryYhzgdinfoByRiskid(riskid);
    }

    @Override
    @DS("#db")
    public YhpcYhzgdinfo getLastYhzginfo(String db) {
        return yhpcYhzgdinfoMapper.queryLatYhzg();
    }

    @Override
    @DS("#db")
    public int addYhzgdinfo(String db, YhpcYhzgdinfo yhpcYhzgdinfo) {
        if (yhpcYhzgdinfo.getId() == null || yhpcYhzgdinfo.getId() == 0){
            yhpcYhzgdinfoMapper.insertSelective(yhpcYhzgdinfo);
        }else {
            yhpcYhzgdinfoMapper.updateByPrimaryKeySelective(yhpcYhzgdinfo);
        }

        return 1;
    }

    @Override
    @DS("#db")
    public YhpcYhzgdinfo getDangerDetail(String db, Long id) {


        return yhpcYhzgdinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    @DS("#db")
    public List getCheckrecord(String db) {


        return yhpcJcjlinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public Map getCheckRecordDetail(String db, Long id) {
        //获取检查记录
        YhpcJcjlinfo yhpcJcjlinfo = yhpcJcjlinfoMapper.selectByPrimaryKey(id);
        //获取检查项
        List<YhpcJcxminfo> yhpcJcxminfos = yhpcJcxminfoMapper.getJcxmByjlid(id);
        Map map = new HashMap();
        map.put("yhpcJcjlinfo",yhpcJcjlinfo);
        map.put("yhpcJcxminfos",yhpcJcxminfos);
        return map;
    }

    @Override
    @DS("#db")
    public List getCheckForm(String db) {


        return yhpcJcbinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public List getCheckFormDetail(String db, Long formId) {

        return yhpcJcbxxinfoMapper.queryJcbxxByJcbid(formId);
    }

    @Override
    @DS("#db")
    public int addCheckRecord(String db, YhpcJcbinfo yhpcJcbinfo, List<YhpcJcbxxinfo> yhpcJcbxxinfos) {
        yhpcJcbinfoMapper.insert(yhpcJcbinfo);
        List addList = new ArrayList();
        ObjectMapper objectMapper = new ObjectMapper();
        for (YhpcJcbxxinfo yhpcJcbxxinfo:yhpcJcbxxinfos){

            YhpcJcbxxinfo yhpcJcbxxinfo1 = objectMapper.convertValue(yhpcJcbxxinfo,YhpcJcbxxinfo.class);
            yhpcJcbxxinfo1.setJcbid(yhpcJcbinfo.getId());
            yhpcJcbxxinfo1.setCreatedAt(new Date());
            addList.add(yhpcJcbxxinfo1);
        }

        yhpcJcbxxinfoMapper.insertYhpcJcbxxinfo(addList);
        return 1;
    }


}
