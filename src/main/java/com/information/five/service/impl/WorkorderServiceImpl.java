package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.*;
import com.information.five.model.*;
import com.information.five.service.WorkorderService;
import com.information.five.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class WorkorderServiceImpl implements WorkorderService {

    @Autowired
    ZyaqDhzinfoMapper zyaqDhzinfoMapper;
    @Autowired
    ZyaqGczinfoMapper zyaqGczinfoMapper;
    @Autowired
    ZyaqSxkjzinfoMapper zyaqSxkjzinfoMapper;
    @Autowired
    ZyaqDzzinfoMapper zyaqDzzinfoMapper;
    @Autowired
    ZyaqLsydzinfoMapper zyaqLsydzinfoMapper;
    @Autowired
    ZyaqDtzinfoMapper zyaqDtzinfoMapper;
    @Autowired
    ZyaqMbcdzinfoMapper zyaqMbcdzinfoMapper;

    @Autowired
    ZyaqDlzinfoMapper zyaqDlzinfoMapper;

    @Override
    @DS("#db")
    public List getFireorderList(String db) {


        return zyaqDhzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqDhzinfo getFireorderDetail(String db, Long orderId) {


        return zyaqDhzinfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    @DS("#db")
    public int changeFireOrder(String db, ZyaqDhzinfo zyaqDhzinfo) {
        if (zyaqDhzinfo.getId() == null || zyaqDhzinfo.getId() == 0){
            //添加
            ZyaqDhzinfo zyaqDhzinfo1 = zyaqDhzinfoMapper.queryLastDh();
            int parm;
            if (zyaqDhzinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqDhzinfo1.getZyzbh().substring(zyaqDhzinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "DHZYZ-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqDhzinfo.setZyzbh(id);
            zyaqDhzinfoMapper.insertSelective(zyaqDhzinfo);

        }else {
            //修改
            zyaqDhzinfoMapper.updateByPrimaryKeySelective(zyaqDhzinfo);
        }


        return 1;
    }

    @Override
    @DS("#db")
    public List getHighorderList(String db) {


        return zyaqGczinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqGczinfo getHighorderDetail(String db, Long orderid) {

        return zyaqGczinfoMapper.selectByPrimaryKey(orderid);
    }

    @Override
    @DS("#db")
    public int changeHighOrder(String db, ZyaqGczinfo zyaqGczinfo) {
        if (zyaqGczinfo.getId() == null || zyaqGczinfo.getId() == 0){
            //添加
            ZyaqGczinfo zyaqGczinfo1 = zyaqGczinfoMapper.queryLast();
            int parm;
            if (zyaqGczinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqGczinfo1.getZyzbh().substring(zyaqGczinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "GCZYZ-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqGczinfo.setZyzbh(id);

            zyaqGczinfoMapper.insertSelective(zyaqGczinfo);
        }else {
            //修改
            zyaqGczinfoMapper.updateByPrimaryKeySelective(zyaqGczinfo);

        }
        return 1;
    }

    @Override
    @DS("#db")
    public List getSpaceorderList(String db) {


        return zyaqSxkjzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqSxkjzinfo getSpaceorderDetail(String db, Long orderId) {
        return zyaqSxkjzinfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    @DS("#db")
    public int changeSpaceOrder(String db, ZyaqSxkjzinfo zyaqSxkjzinfo) {

        if (zyaqSxkjzinfo.getId() == null || zyaqSxkjzinfo.getId() == 0){
            //添加

            ZyaqSxkjzinfo zyaqSxkjzinfo1 = zyaqSxkjzinfoMapper.queryLast();
            int parm;
            if (zyaqSxkjzinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqSxkjzinfo1.getZyzbh().substring(zyaqSxkjzinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "SXKJZYZ-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqSxkjzinfo.setZyzbh(id);

            zyaqSxkjzinfoMapper.insertSelective(zyaqSxkjzinfo);



        }else {
            //修改
            zyaqSxkjzinfoMapper.updateByPrimaryKeySelective(zyaqSxkjzinfo);
        }
        return 0;
    }

    @Override
    @DS("#db")
    public List getHoistingordrList(String db) {

        return zyaqDzzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqDzzinfo getHoistingorderDetail(String db, Long orderId) {

        return zyaqDzzinfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    @DS("#db")
    public int changeHoistingOrder(String db, ZyaqDzzinfo zyaqDzzinfo) {
        if (zyaqDzzinfo.getId() == null || zyaqDzzinfo.getId() == 0){
            //添加
            ZyaqDzzinfo zyaqDzzinfo1 = zyaqDzzinfoMapper.queryLast();
            int parm;
            if (zyaqDzzinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqDzzinfo1.getZyzbh().substring(zyaqDzzinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "DZZYZ-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqDzzinfo.setZyzbh(id);

            zyaqDzzinfoMapper.insertSelective(zyaqDzzinfo);

        }else {
            //修改
            zyaqDzzinfoMapper.updateByPrimaryKeySelective(zyaqDzzinfo);

        }

        return 1;
    }

    @Override
    @DS("#db")
    public List<ZyaqLsydzinfo> getelectricorderList(String db) {


        return zyaqLsydzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqLsydzinfo getelectricorderDetail(String db, Long orderId) {
        return zyaqLsydzinfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    @DS("#db")
    public int changeElectricOrder(String db, ZyaqLsydzinfo zyaqLsydzinfo) {
        if (zyaqLsydzinfo.getId() == null ||  zyaqLsydzinfo.getId() == 0){
            //添加
            ZyaqLsydzinfo zyaqLsydzinfo1 = zyaqLsydzinfoMapper.queryLast();
            int parm;
            if (zyaqLsydzinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqLsydzinfo1.getZyzbh().substring(zyaqLsydzinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "LSYDZYP-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqLsydzinfo.setZyzbh(id);

            zyaqLsydzinfoMapper.insertSelective(zyaqLsydzinfo);

        }else {
            //修改
            zyaqLsydzinfoMapper.updateByPrimaryKeySelective(zyaqLsydzinfo);

        }
        return 1;
    }

    @Override
    @DS("#db")
    public List getSoilorderList(String db) {

        return zyaqDtzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqDtzinfo getSoilorderDetail(String db, Long orderId) {
        return zyaqDtzinfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    @DS("#db")
    public int changeSoilOrder(String db, ZyaqDtzinfo zyaqDtzinfo) {
        if (zyaqDtzinfo.getId() == null || zyaqDtzinfo.getId() == 0){
            //添加

            ZyaqDtzinfo zyaqDtzinfo1 = zyaqDtzinfoMapper.queryLast();
            int parm;
            if (zyaqDtzinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqDtzinfo1.getZyzbh().substring(zyaqDtzinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "DTZYZ-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqDtzinfo.setZyzbh(id);

            zyaqDtzinfoMapper.insert(zyaqDtzinfo);

        }else {
            //修改
            zyaqDtzinfoMapper.updateByPrimaryKeySelective(zyaqDtzinfo);
        }

        return 1;
    }

    @Override
    @DS("#db")
    public List getWallorderList(String db) {


        return zyaqMbcdzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqMbcdzinfo getWallorderDetail(String db, Long orderId) {

        return zyaqMbcdzinfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    @DS("#db")
    public int changeWallOrder(String db, ZyaqMbcdzinfo zyaqMbcdzinfo) {
        if (zyaqMbcdzinfo.getId() == 0 || zyaqMbcdzinfo.getId() == null){
            //添加

            ZyaqMbcdzinfo zyaqMbcdzinfo1 = zyaqMbcdzinfoMapper.queryLast();
            int parm;
            if (zyaqMbcdzinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqMbcdzinfo1.getZyzbh().substring(zyaqMbcdzinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "MBCDZYZ-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqMbcdzinfo.setZyzbh(id);

            zyaqMbcdzinfoMapper.insertSelective(zyaqMbcdzinfo);

        }else {
            //修改
            zyaqMbcdzinfoMapper.updateByPrimaryKey(zyaqMbcdzinfo);
        }

        return 1;
    }

    @Override
    @DS("#db")
    public List getBreakorderList(String db) {

        return zyaqDlzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqDlzinfo getBreakorderDetail(String db, Long orderid) {

        return zyaqDlzinfoMapper.selectByPrimaryKey(orderid);
    }

    @Override
    @DS("#db")
    public int changeBreakOrder(String db, ZyaqDlzinfo zyaqDlzinfo) {

        if (zyaqDlzinfo.getId() == null || zyaqDlzinfo.getId() == 0){
            //添加

            ZyaqDlzinfo zyaqDlzinfo1 = zyaqDlzinfoMapper.queryLast();
            int parm;
            if (zyaqDlzinfo1 == null){
                parm = 1;
            }else {
                parm =  Integer.parseInt(zyaqDlzinfo1.getZyzbh().substring(zyaqDlzinfo1.getZyzbh().lastIndexOf("-")+1));
            }

            parm += 1;
            //DecimalFormat df = new DecimalFormat("0000");
            String str2 = parm+"";
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String id = "DLZYZ-"+simpleDateFormat.format(date)+"-"+str2;
            zyaqDlzinfo.setZyzbh(id);

            zyaqDlzinfoMapper.insertSelective(zyaqDlzinfo);

        }else {
            zyaqDlzinfoMapper.updateByPrimaryKeySelective(zyaqDlzinfo);
        }

        return 1;
    }
}
