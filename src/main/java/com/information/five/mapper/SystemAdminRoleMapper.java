package com.information.five.mapper;

import com.information.five.model.SystemAdminRole;

import java.util.List;

public interface SystemAdminRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemAdminRole record);

    int insertSelective(SystemAdminRole record);

    SystemAdminRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemAdminRole record);

    int updateByPrimaryKey(SystemAdminRole record);

    /**
     * 根据用户id获取角色列表
     * @param adminId
     * @return
     */
    List<SystemAdminRole> queryRoleByAdminId(Long adminId);
}