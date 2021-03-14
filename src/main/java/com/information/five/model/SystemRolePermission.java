package com.information.five.model;

import java.io.Serializable;


/**
 * system_role_permission
 * @author 
 */

public class SystemRolePermission implements Serializable {
    private Long id;

    /**
     * 管理员id
     */
    private Integer roleId;

    /**
     * 角色id
     */
    private Integer permissionId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}