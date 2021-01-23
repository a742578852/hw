package com.information.five.mapper;

import com.information.five.model.SystemAdmin;

public interface SystemAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemAdmin record);

    int insertSelective(SystemAdmin record);

    SystemAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemAdmin record);

    int updateByPrimaryKey(SystemAdmin record);

    SystemAdmin querySystemByUsername(String username);
}