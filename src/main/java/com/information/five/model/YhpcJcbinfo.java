package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * yhpc_jcbinfo 检查表
 * @author 
 */

public class YhpcJcbinfo implements Serializable {
    private Long id;

    /**
     * 标题
     */
    private String bt;

    /**
     * 备注
     */
    private String bz;

    private String tbr;

    private Integer isty;

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

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getTbr() {
        return tbr;
    }

    public void setTbr(String tbr) {
        this.tbr = tbr;
    }

    public Integer getIsty() {
        return isty;
    }

    public void setIsty(Integer isty) {
        this.isty = isty;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}