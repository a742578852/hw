package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * system_permission
 * @author 
 */

public class SystemPermission implements Serializable {
    private Long id;

    private Integer modelid;

    /**
     * 父级id
     */
    private Integer parentid;

    /**
     * 权限名称
     */
    private String authorityname;

    /**
     * 权限标识
     */
    private String authority;

    /**
     * 规定好的路由
     */
    private String routename;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 权限类型
     */
    private Byte authoritytype;

    /**
     * 排序,按数字从小到大排序
     */
    private Byte sort;

    /**
     * 是否为系统菜单，系统菜单不可删除 , 1.是 ，2.否
     */
    private Byte system;

    /**
     * 状态1启用，2禁用
     */
    private Byte status;

    /**
     * 展开
     */
    private Integer extended;

    /**
     * 创建时间
     */
    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Byte getAuthoritytype() {
        return authoritytype;
    }

    public void setAuthoritytype(Byte authoritytype) {
        this.authoritytype = authoritytype;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Byte getSystem() {
        return system;
    }

    public void setSystem(Byte system) {
        this.system = system;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getExtended() {
        return extended;
    }

    public void setExtended(Integer extended) {
        this.extended = extended;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}