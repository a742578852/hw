package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.information.five.mapper.*;
import com.information.five.model.*;
import com.information.five.service.JudgeService;
import com.information.five.util.DateUtils;
import com.information.five.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class JudgeServiceImpl implements JudgeService {
    @Autowired
    FxypBzjinfoMapper fxypBzjinfoMapper;
    @Autowired
    FxypAqcninfoMapper fxypAqcninfoMapper;
    @Autowired
    FxypYpnrinfoMapper fxypYpnrinfoMapper;
    @Autowired
    FxypCjypjlinfoMapper fxypCjypjlinfoMapper;
    @Autowired
    FxypGsypjlinfoMapper fxypGsypjlinfoMapper;

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

        map.put("fxypBzjinfo", fxypBzjinfo);
        map.put("fxypYpnrinfos", fxypYpnrinfos);
        map.put("fxypAqcninfo", fxypAqcninfo);


        return map;
    }

    @Override
    @DS("#db")
    public int addOrUpdateJudge(String db, FxypBzjinfo fxypBzjinfo, List<FxypYpnrinfo> fxypYpnrinfo, FxypAqcninfo fxypAqcninfo) {
        ObjectMapper objectMapper = new ObjectMapper();
        if (fxypBzjinfo != null) {
            //修改
            if (fxypBzjinfo.getId() != null && fxypBzjinfo.getId() != 0) {
                fxypBzjinfoMapper.updateByPrimaryKeySelective(fxypBzjinfo);
                for (int i = 0; i < fxypYpnrinfo.size(); i++) {
                    FxypYpnrinfo fxypYpnrinfo1 = objectMapper.convertValue(fxypYpnrinfo.get(i), FxypYpnrinfo.class);

                    fxypYpnrinfoMapper.updateByPrimaryKeySelective(fxypYpnrinfo1);
                }

                fxypAqcninfoMapper.updateByPrimaryKeySelective(fxypAqcninfo);

                return 1;
            }
            //新增
            fxypBzjinfo.setGs("总公司");
            fxypBzjinfo.setCreatedAt(new Date());
            fxypBzjinfoMapper.insertSelective(fxypBzjinfo);
            fxypAqcninfo.setBzjid(fxypBzjinfo.getId());
            fxypAqcninfo.setCreatedAt(new Date());
            fxypAqcninfoMapper.insertSelective(fxypAqcninfo);

            for (int i = 0; i < fxypYpnrinfo.size(); i++) {

                FxypYpnrinfo fxypYpnrinfo1 = objectMapper.convertValue(fxypYpnrinfo.get(i), FxypYpnrinfo.class);


                fxypYpnrinfo1.setCreatedAt(new Date());
                fxypYpnrinfo1.setBzjid(fxypBzjinfo.getId());
                fxypYpnrinfoMapper.insertSelective(fxypYpnrinfo1);
            }


            return 1;

        }

        return 0;
    }

    @Override
    @DS("#db")
    public Result summaryCjinfo(String db, String date, String cj, String sbr) {

        FxypCjypjlinfo fxypCjypjlinfo = new FxypCjypjlinfo();
        //查询当前时间当前车间的基本信息记录
        List<FxypBzjinfo> fxypBzjinfos = fxypBzjinfoMapper.queryBzjinfoByDadeAndCj(date, cj);
        if (null == fxypBzjinfos) {
            return new Result(204, true, date + cj + "没有进行风险研判");
        }

        List bzIds = new ArrayList();
        String BZ = "";
        String bzsbr = "";
        for (int i = 0; i < fxypBzjinfos.size(); i++) {
            bzIds.add(fxypBzjinfos.get(i).getId());
            if (i == 0) {
                BZ = fxypBzjinfos.get(i).getBz();
                bzsbr = fxypBzjinfos.get(i).getTbr();
            } else {
                BZ = BZ + "," + fxypBzjinfos.get(i).getBz();
                bzsbr = bzsbr + ","+fxypBzjinfos.get(i).getTbr();
            }
        }
        fxypCjypjlinfo.setBm(fxypBzjinfos.get(0).getCj());
        fxypCjypjlinfo.setSbsj(date);
        fxypCjypjlinfo.setSbr(sbr);
        fxypCjypjlinfo.setBz(BZ);
        fxypCjypjlinfo.setBzsbr(bzsbr);
        fxypCjypjlinfo.setBzsbsj(date);
        fxypCjypjlinfo.setCreatedAt(new Date());

        //获取所有承诺信息
        List<FxypAqcninfo> fxypAqcninfos = fxypAqcninfoMapper.getAqcnByList(bzIds);
        //生产装置合并
        int sczz = 0;
        //其中运行
        int qzyx = 0;
        //停产
        int tc = 0;
        //检修
        int jx = 0;
        //一级动火
        int yj = 0;
        //二级
        int ej = 0;
        //特级动火
        int tj = 0;
        //空间作业
        int kjzy = 0;
        //高空作业
        int gkzy = 0;
        //特殊作业
        int tszy = 0;
        //是否试生产
        String ssc = "否";
        //是否处于开停车状态
        String tczt = "否";
        //罐区、仓库等重大危险源是否处于安全状态(是、否)
        String aqzt = "是";
        for (int i = 0; i < fxypAqcninfos.size(); i++) {
            sczz += fxypAqcninfos.get(i).getBzgw();
            qzyx += fxypAqcninfos.get(i).getQzyx();
            tc += fxypAqcninfos.get(i).getTc();
            jx += fxypAqcninfos.get(i).getJx();
            yj += fxypAqcninfos.get(i).getYj();
            ej += fxypAqcninfos.get(i).getEj();
            tj += fxypAqcninfos.get(i).getTj();
            kjzy += fxypAqcninfos.get(i).getSx();
            gkzy += fxypAqcninfos.get(i).getGc();
            tszy += fxypAqcninfos.get(i).getTs();
            if (fxypAqcninfos.get(i).getSsc() != null && fxypAqcninfos.get(i).getSsc().equals("是")) {
                ssc = "是";
            }
            if (fxypAqcninfos.get(i).getKtc() != null && fxypAqcninfos.get(i).getKtc().equals("是")) {
                tczt = "是";
            }
            if (fxypAqcninfos.get(i).getWhwxl().equals("否") || fxypAqcninfos.get(i).getCxyx().equals("否") ||
                    fxypAqcninfos.get(i).getRyzg().equals("否") || fxypAqcninfos.get(i).getYxzt().equals("否") ||
                    fxypAqcninfos.get(i).getHfhc().equals("否")) {
                aqzt = "否";
            }
        }
        fxypCjypjlinfo.setSczz(sczz);
        fxypCjypjlinfo.setQzyx(qzyx);
        fxypCjypjlinfo.setTc(tc);
        fxypCjypjlinfo.setJx(jx);
        fxypCjypjlinfo.setYj(yj);
        fxypCjypjlinfo.setEj(ej);
        fxypCjypjlinfo.setTj(tj);
        fxypCjypjlinfo.setKjzy(kjzy);
        fxypCjypjlinfo.setGczy(gkzy);
        fxypCjypjlinfo.setTszy(tszy);
        fxypCjypjlinfo.setSsc(ssc);
        fxypCjypjlinfo.setTczt(tczt);
        fxypCjypjlinfo.setAqzt(aqzt);

        if (fxypBzjinfos.get(0).getCjid() != 0) {
            fxypCjypjlinfo.setId(fxypBzjinfos.get(0).getCjid());
            fxypCjypjlinfoMapper.updateByPrimaryKeySelective(fxypCjypjlinfo);
        } else {
            //新增车间记录
            fxypCjypjlinfoMapper.insertSelective(fxypCjypjlinfo);
            //修改班组基本信息
            for (FxypBzjinfo fxypBzjinfo : fxypBzjinfos) {

                fxypBzjinfo.setCjid(fxypCjypjlinfo.getId());
                fxypBzjinfoMapper.updateByPrimaryKeySelective(fxypBzjinfo);
            }
            //修改承诺
            for (FxypAqcninfo fxypAqcninfo : fxypAqcninfos) {
                fxypAqcninfo.setCjid(fxypCjypjlinfo.getId());
                fxypAqcninfoMapper.updateByPrimaryKeySelective(fxypAqcninfo);
            }


            //修改研判详情
            fxypYpnrinfoMapper.updateCjidByBzjid(bzIds, fxypCjypjlinfo.getId());
        }


        return new Result(200, true, "汇总成功");

    }

    @Override
    @DS("#db")
    public List<FxypCjypjlinfo> getCjInfo(String db) {


        return fxypCjypjlinfoMapper.queryCjInfo();
    }

    @Override
    @DS("#db")
    public Map getCjinfoDetail(String db, Long cjid) {
        FxypCjypjlinfo fxypCjypjlinfo = fxypCjypjlinfoMapper.selectByPrimaryKey(cjid);
        List bzjList = fxypBzjinfoMapper.queryBzjinfoByCjid(cjid);
        Map map = new HashMap();
        map.put("cjinfo", fxypCjypjlinfo);
        map.put("bzjList", bzjList);

        return map;
    }

    @Override
    @DS("#db")
    public List<FxypYpnrinfo> getYpnrDetail(String db, Long bzjid) {

        List<FxypYpnrinfo> fxypYpnrinfos = fxypYpnrinfoMapper.queryYpnrinfoByBid(bzjid);

        return fxypYpnrinfos;
    }

    @Override
    @DS("#db")
    public FxypAqcninfo getCnDetail(String db, Long bzid) {


        return fxypAqcninfoMapper.getAqcninfoByBzjid(bzid);
    }

    @Override
    @DS("#db")
    public Result mergeGsinfo(String db, String gsname, String sbr, String date) {

        //按日期查询所有车间研判
        List<FxypCjypjlinfo> fxypCjypjlinfos = fxypCjypjlinfoMapper.queryCjinfoByDate(date);
        if (fxypCjypjlinfos == null) {
            return new Result(200, true, date + "没有研判记录");
        }

        //生产装置
        int sczz = 0;
        //其中运行
        int qzyx = 0;
        //停产
        int tc = 0;
        //检修
        int jx = 0;
        //一级动火
        int yj = 0;
        //二级动火
        int ej = 0;
        //特级动火
        int tj = 0;
        //空间作业
        int kjzy = 0;
        //高处作业
        int gczy = 0;
        //特殊作业
        int tszy = 0;
        //是否试生产
        String ssc = "否";
        //是否处于开停车状态
        String tczt = "否";
        //是否重大危险源
        String aqzt = "否";
        //班组
        String bz = "";
        //班组上报人
        String bzsbr = "";

        for (FxypCjypjlinfo fxypCjypjlinfo : fxypCjypjlinfos) {
            sczz += fxypCjypjlinfo.getSczz();
            qzyx += fxypCjypjlinfo.getQzyx();
            tc += fxypCjypjlinfo.getTc();
            jx += fxypCjypjlinfo.getJx();
            yj += fxypCjypjlinfo.getYj();
            ej += fxypCjypjlinfo.getEj();
            tj += fxypCjypjlinfo.getTj();
            kjzy += fxypCjypjlinfo.getKjzy();
            gczy += fxypCjypjlinfo.getGczy();
            tszy += fxypCjypjlinfo.getTszy();
            if (fxypCjypjlinfo.getSsc()!= null && fxypCjypjlinfo.getSsc().equals("是")){
                ssc = "是";
            }
            if (fxypCjypjlinfo.getTczt().equals("是")){
                tczt = "是";
            }
            if (fxypCjypjlinfo.getAqzt().equals("是")){
                aqzt = "是";
            }
            if (bz.equals("")){
                bz = fxypCjypjlinfo.getBz();
            }else {
                bz = bz+","+fxypCjypjlinfo.getBz();
            }
            if (bzsbr.equals("")){
                bzsbr = fxypCjypjlinfo.getBzsbr();
            }else {
                bzsbr = bzsbr+","+fxypCjypjlinfo.getBzsbr();
            }
        }

        FxypGsypjlinfo fxypGsypjlinfo = new FxypGsypjlinfo();
        fxypGsypjlinfo.setBm("总公司");
        fxypGsypjlinfo.setSbsj(date);
        fxypGsypjlinfo.setSbr(sbr);
        fxypGsypjlinfo.setSczz(sczz);
        fxypGsypjlinfo.setQzyx(qzyx);
        fxypGsypjlinfo.setTc(tc);
        fxypGsypjlinfo.setJx(jx);
        fxypGsypjlinfo.setJx(yj);
        fxypGsypjlinfo.setEj(ej);
        fxypGsypjlinfo.setTj(tj);
        fxypGsypjlinfo.setKjzy(kjzy);
        fxypGsypjlinfo.setGczy(gczy);
        fxypGsypjlinfo.setTszy(tszy);
        fxypGsypjlinfo.setSsc(ssc);
        fxypGsypjlinfo.setTczt(tczt);
        fxypGsypjlinfo.setAqzt(aqzt);
        fxypGsypjlinfo.setBz(bz);
        fxypGsypjlinfo.setBzsbr(bzsbr);
        fxypGsypjlinfo.setBzsbsj(date);
        //按日期查询今天是否有汇总过
        FxypGsypjlinfo fxypGsypjlinfo1 = fxypGsypjlinfoMapper.queryGsinfo(date);
        if (fxypGsypjlinfo1 != null){
            fxypGsypjlinfo.setId(fxypGsypjlinfo1.getId());
            fxypGsypjlinfoMapper.updateByPrimaryKeySelective(fxypGsypjlinfo);
        }else {
            fxypGsypjlinfoMapper.insertSelective(fxypGsypjlinfo);
            //修改班组级信息公司id
            //查询所有今天的班组
            List<FxypBzjinfo> fxypBzjinfos = fxypBzjinfoMapper.queryBzinfoByDate(date);
            List list = new ArrayList();
            for (FxypBzjinfo fxypBzjinfo:fxypBzjinfos){
                list.add(fxypBzjinfo.getId());
                fxypBzjinfo.setGsid(fxypGsypjlinfo.getId());
                fxypBzjinfoMapper.updateByPrimaryKeySelective(fxypBzjinfo);
            }
            //修改研判内容公司级id
            //查询今天所有的研判内容
            fxypYpnrinfoMapper.updateYpnrByList(list,fxypGsypjlinfo.getId());

            //修改承诺公司id
            fxypAqcninfoMapper.updateGsidByList(list,fxypGsypjlinfo.getId());

        }



        return new Result(200,true,"汇总成功");
    }

    @Override
    @DS("#db")
    public List<FxypGsypjlinfo> getAllGsinfo(String db) {



        return fxypGsypjlinfoMapper.queryAllGsinfo();
    }

    @Override
    @DS("#db")
    public Map getGsinfoDetail(String db, Long gsid) {
        Map map = new HashMap();
        //获取公司信息
        FxypGsypjlinfo fxypGsypjlinfo = fxypGsypjlinfoMapper.selectByPrimaryKey(gsid);
        //获取研判基本信息
        List<FxypBzjinfo> fxypBzjinfos = fxypBzjinfoMapper.queryBzjinfoByGsid(gsid);
        map.put("gsinfo",fxypGsypjlinfo);
        map.put("bzjinfo",fxypBzjinfos);
        return map;
    }
}
