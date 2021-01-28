package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.FxbsFxsbinfoMapper;
import com.information.five.mapper.YhpcYhzgdinfoMapper;
import com.information.five.model.FxbsFxsbinfo;
import com.information.five.model.YhpcYhzgdinfo;
import com.information.five.service.RiskService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskServiceImpl implements RiskService {
    @Autowired
    FxbsFxsbinfoMapper fxbsFxsbinfoMapper;
    @Autowired
    YhpcYhzgdinfoMapper yhpcYhzgdinfoMapper;

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


}
