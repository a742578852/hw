package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.BaseBminfoMapper;
import com.information.five.mapper.SystemAdminMapper;
import com.information.five.model.BaseBminfo;
import com.information.five.model.SystemAdmin;
import com.information.five.service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilServiceImpl implements UtilService {
    @Autowired
    BaseBminfoMapper baseBminfoMapper;
    @Autowired
    SystemAdminMapper systemAdminMapper;
    @Override
    @DS("#db")
    public List<BaseBminfo> getBminfo(String db) {
        return baseBminfoMapper.queryAll();
    }

    @Override
    @DS("#db")
    public List<SystemAdmin> getAdmin(String db, String username) {
        return systemAdminMapper.queryAdminByParms(username);
    }
}
