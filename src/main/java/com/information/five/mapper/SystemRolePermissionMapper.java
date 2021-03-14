package com.information.five.mapper;

import com.information.five.model.SystemRolePermission;

import java.util.List;

public interface SystemRolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemRolePermission record);

    int insertSelective(SystemRolePermission record);

    SystemRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemRolePermission record);

    int updateByPrimaryKey(SystemRolePermission record);

    /**
     * 根据role查询所有权限
     * @param role
     * @return
     */
    List<Integer> queryRolePermissionByRole(int role);
}