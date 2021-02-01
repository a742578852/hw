package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * yhpc_jcbxxinfo
 * @author 
 */

public class YhpcJcbxxinfo implements Serializable {
    private Long id;

    private Long jcbid;

    /**
     * 检查项目
     */
    private String jcxm;

    /**
     * 检查内容
     */
    private String jcnr;

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

    public Long getJcbid() {
        return jcbid;
    }

    public void setJcbid(Long jcbid) {
        this.jcbid = jcbid;
    }

    public String getJcxm() {
        return jcxm;
    }

    public void setJcxm(String jcxm) {
        this.jcxm = jcxm;
    }

    public String getJcnr() {
        return jcnr;
    }

    public void setJcnr(String jcnr) {
        this.jcnr = jcnr;
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