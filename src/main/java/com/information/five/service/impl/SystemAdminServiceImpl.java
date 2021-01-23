package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.SubjectMapper;
import com.information.five.mapper.SystemAdminMapper;
import com.information.five.model.SystemAdmin;
import com.information.five.service.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SystemAdminServiceImpl implements SystemAdminService {

    @Autowired
    SystemAdminMapper systemAdminMapper;

    @Autowired
    SubjectMapper subjectMapper;

    @Override
    @DS("#tb")
    public Boolean getSystemAdminInfo(String username, String password,String tb) {
        //根据用户名查询用户信息
        SystemAdmin systemAdmin = systemAdminMapper.querySystemByUsername(username);
        //System.out.println(systemAdmin.getNick());
        if (systemAdmin == null){
            return false;
        }
        //判断密码是否正确
        BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
        //数据库密码修改版本(大坑---php和java版本不一样)
        String dbPs = systemAdmin.getPassword().replace("$2y$","$2a$");
        if(bcp.matches(password,dbPs)){
            return true;
        }

        return false;
    }

    @Override
    @DS("#db")
    public SystemAdmin getSystemAdminById(long id,String db) {

        return systemAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    @DS("#db")
    public SystemAdmin getSystemAdminByUserName(String username,String db) {


        return systemAdminMapper.querySystemByUsername(username);
    }

    @Override
    @DS("#db")
    public int updateSystem(SystemAdmin systemAdmin,String db) {
        return systemAdminMapper.updateByPrimaryKeySelective(systemAdmin);
    }

}
