package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.*;
import com.information.five.model.*;
import com.information.five.service.WorkorderService;
import com.information.five.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List getBreakorderList(String db) {

        return zyaqDlzinfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public ZyaqDlzinfo getBreakorderDetail(String db, Long orderid) {

        return zyaqDlzinfoMapper.selectByPrimaryKey(orderid);
    }
}
