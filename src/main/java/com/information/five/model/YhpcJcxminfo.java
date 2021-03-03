package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * yhpc_jcxminfo
 * @author 
 */

public class YhpcJcxminfo implements Serializable {
    private Long id;

    private Long jcjlid;

    private Long jcbid;

    private String jcnr;

    /**
     * 检查项目
     */
    private String jcxm;

    /**
     * 检查标准
     */
    private String jcbz;

    /**
     * 检查结论
     */
    private String jcjl;

    /**
     * 描述
     */
    private String ms;

    /**
     * 整改方式 无需整改、立即整改、整改通知
     */
    private String zgfs;

    /**
     * 创建时间
     */
    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public String getJcnr() {
        return jcnr;
    }

    public void setJcnr(String jcnr) {
        this.jcnr = jcnr;
    }

    public Long getJcbid() {
        return jcbid;
    }

    public void setJcbid(Long jcbid) {
        this.jcbid = jcbid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJcjlid() {
        return jcjlid;
    }

    public void setJcjlid(Long jcjlid) {
        this.jcjlid = jcjlid;
    }

    public String getJcxm() {
        return jcxm;
    }

    public void setJcxm(String jcxm) {
        this.jcxm = jcxm;
    }

    public String getJcbz() {
        return jcbz;
    }

    public void setJcbz(String jcbz) {
        this.jcbz = jcbz;
    }

    public String getJcjl() {
        return jcjl;
    }

    public void setJcjl(String jcjl) {
        this.jcjl = jcjl;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getZgfs() {
        return zgfs;
    }

    public void setZgfs(String zgfs) {
        this.zgfs = zgfs;
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