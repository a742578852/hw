package com.information.five.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.information.five.mapper.*;
import com.information.five.model.SystemAdmin;
import com.information.five.model.SystemAdminRole;
import com.information.five.model.SystemRolePermission;
import com.information.five.service.SystemAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SystemAdminServiceImpl implements SystemAdminService {

    @Autowired
    SystemAdminMapper systemAdminMapper;

    @Autowired
    SubjectMapper subjectMapper;

    @Autowired
    SystemAdminRoleMapper systemAdminRoleMapper;
    @Autowired
    SystemRolePermissionMapper systemRolePermissionMapper;
    @Autowired
    SystemPermissionMapper systemPermissionMapperl;

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

    @Override
    @DS("#db")
    public Map authorityCheck(String db, Long id) {
        Map map = new HashMap();
        //在线学习模块
        int studyFlg = 0;
        //在线考试模块
        int examinationFlg = 0;
        //风险模块
        int riskFlg = 0;
        //安全检查模块
        int inspectFlg = 0;
        //研判模块
        int judgeFlg = 0;
        //作业管理模块
        int orderFlg = 0;
        //隐患模块
        int dangerFlg = 0;


        //查询该账号的所有角色
        List<SystemAdminRole> roles = systemAdminRoleMapper.queryRoleByAdminId(id);
        for (SystemAdminRole systemAdminRole:roles){
            //查询当前角色的所有权限
            List<Integer> perIds = systemRolePermissionMapper.queryRolePermissionByRole(systemAdminRole.getRoleId());

                for (Integer perId :perIds){
                    if (perId == 188){
                        studyFlg = 1;
                        examinationFlg = 1;
                    }else if(perId == 136){
                        riskFlg = 1;

                        judgeFlg = 1;
                    }else if(perId == 203){
                        inspectFlg = 1;
                        dangerFlg = 1;
                    }else if(perId == 192){
                        orderFlg = 1;
                    }

                }



        }

        map.put("studyFlg",studyFlg);
        map.put("examinationFlg",examinationFlg);
        map.put("riskFlg",riskFlg);
        map.put("inspectFlg",inspectFlg);
        map.put("judgeFlg",judgeFlg);
        map.put("orderFlg",orderFlg);
        map.put("dangerFlg",dangerFlg);
        return map;
    }

}
