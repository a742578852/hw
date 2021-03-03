package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.information.five.mapper.*;
import com.information.five.model.*;
import com.information.five.service.RiskService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
    public int addCheckRecord(String db, YhpcJcjlinfo yhpcJcjlinfo, List<YhpcJcxminfo> yhpcJcxminfos) {
        //检查id生成
        YhpcJcjlinfo yhpcJcjlinfo1 = yhpcJcjlinfoMapper.queryLast();
        int parm =  Integer.parseInt(yhpcJcjlinfo1.getJcdh().substring(yhpcJcjlinfo1.getJcdh().lastIndexOf("-")+1));
        parm += 1;
        DecimalFormat df = new DecimalFormat("0000");
        String str2 = df.format(parm);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String id = "JCDH-"+simpleDateFormat.format(date)+"-"+str2;
        yhpcJcjlinfo.setJcdh(id);
        yhpcJcjlinfoMapper.insertSelective(yhpcJcjlinfo);
        List addList = new ArrayList();
        ObjectMapper objectMapper = new ObjectMapper();
        for (int i = 0;i<yhpcJcxminfos.size();i++){

            YhpcJcxminfo yhpcJcxminfo1 = objectMapper.convertValue(yhpcJcxminfos.get(i),YhpcJcxminfo.class);
            yhpcJcxminfo1.setJcbz(yhpcJcxminfo1.getJcnr());
            yhpcJcxminfo1.setJcjlid(yhpcJcjlinfo.getId());
            yhpcJcxminfo1.setCreatedAt(new Date());
            addList.add(yhpcJcxminfo1);
        }

        yhpcJcxminfoMapper.insertList(addList);
        return 1;
    }


}
