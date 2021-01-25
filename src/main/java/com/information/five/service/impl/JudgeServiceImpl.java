package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.FxypAqcninfoMapper;
import com.information.five.mapper.FxypBzjinfoMapper;
import com.information.five.mapper.FxypYpnrinfoMapper;
import com.information.five.model.FxypAqcninfo;
import com.information.five.model.FxypBzjinfo;
import com.information.five.model.FxypYpnrinfo;
import com.information.five.service.JudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JudgeServiceImpl implements JudgeService {
    @Autowired
    FxypBzjinfoMapper fxypBzjinfoMapper;
    @Autowired
    FxypAqcninfoMapper fxypAqcninfoMapper;
    @Autowired
    FxypYpnrinfoMapper fxypYpnrinfoMapper;

    @Override
    @DS("#db")
    public List<FxypBzjinfo> getFxypinfo(String db) {


        return fxypBzjinfoMapper.queryBzjinfo();
    }

    @Override
    @DS("#db")
    public Map getBzjInfos(Long bid, String db) {

        Map map = new HashMap();
        //获取基本信息
        FxypBzjinfo fxypBzjinfo = fxypBzjinfoMapper.selectByPrimaryKey(bid);
        //获取对应的研判信息
        List<FxypYpnrinfo> fxypYpnrinfos = fxypYpnrinfoMapper.queryYpnrinfoByBid(bid);
        //获取承诺信息
        FxypAqcninfo fxypAqcninfo = fxypAqcninfoMapper.getAqcninfoByBzjid(bid);

        map.put("fxypBzjinfo",fxypBzjinfo);
        map.put("fxypYpnrinfos",fxypYpnrinfos);
        map.put("fxypAqcninfo",fxypAqcninfo);


        return map;
    }

    @Override
    @DS("#db")
    @Transactional(rollbackFor = Exception.class)
    public int addOrUpdateJudge(String db, FxypBzjinfo fxypBzjinfo, FxypYpnrinfo fxypYpnrinfo, FxypAqcninfo fxypAqcninfo) {
        if (fxypBzjinfo != null){
            //修改
            if (fxypBzjinfo.getId() != 0 && fxypBzjinfo.getId() != null){
             fxypBzjinfoMapper.updateByPrimaryKeySelective(fxypBzjinfo);
             fxypYpnrinfoMapper.updateByPrimaryKeySelective(fxypYpnrinfo);
             fxypAqcninfoMapper.updateByPrimaryKeySelective(fxypAqcninfo);

                return 1;
            }
            //新增
            fxypAqcninfoMapper.insertSelective(fxypAqcninfo);
            fxypYpnrinfoMapper.insertSelective(fxypYpnrinfo);
            fxypBzjinfoMapper.insertSelective(fxypBzjinfo);
            return 1;

        }

        return 0;
    }
}
