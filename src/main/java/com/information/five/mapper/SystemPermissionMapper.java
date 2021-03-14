package com.information.five.mapper;

import com.information.five.model.SystemPermission;

public interface SystemPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemPermission record);

    int insertSelective(SystemPermission record);

    SystemPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemPermission record);

    int updateByPrimaryKey(SystemPermission record);
}