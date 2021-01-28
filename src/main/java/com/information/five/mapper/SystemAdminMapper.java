package com.information.five.mapper;

import com.information.five.model.SystemAdmin;

import java.util.List;

public interface SystemAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemAdmin record);

    int insertSelective(SystemAdmin record);

    SystemAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemAdmin record);

    int updateByPrimaryKey(SystemAdmin record);

    SystemAdmin querySystemByUsername(String username);

    /**
     * 根据关键字获取用户名
     * @param userName
     * @return
     */
    List<SystemAdmin> queryAdminByParms(String userName);
}