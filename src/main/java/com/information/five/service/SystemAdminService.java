package com.information.five.service;

import com.information.five.model.SystemAdmin;

import java.util.Map;

public interface SystemAdminService {

    /**
     * 登录校验
     * @param username
     * @param password
     * @param
     * @return
     */
    Boolean getSystemAdminInfo(String username, String password,String tb);

    /**
     * 根据id查用户信息
     * @param id
     * @return
     */
    SystemAdmin getSystemAdminById(long id,String db);

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    SystemAdmin getSystemAdminByUserName(String username,String db);

    /**
     * 修改用户信息
     * @param systemAdmin
     * @return
     */
    int updateSystem(SystemAdmin systemAdmin,String db);

    /**
     * 权限校验
     * @return
     */
    Map authorityCheck(String db,Long id);

}
