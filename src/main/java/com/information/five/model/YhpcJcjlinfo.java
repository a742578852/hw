package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * yhpc_jcjlinfo
 * @author 
 */

public class YhpcJcjlinfo implements Serializable {
    private Long id;

    /**
     * 检查类型
     */
    private String jclx;

    /**
     * 检查单号 JCDH-2020-0001
     */
    private String jcdh;

    /**
     * 录入人
     */
    private String lrr;

    /**
     * 检查日期
     */
    private String jcrq;

    /**
     * 检查组成员
     */
    private String jczcy;

    /**
     * 受检部门
     */
    private String sjbm;

    /**
     * 隐患照片
     */
    private String yhzp;

    private Long jcbid;

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

    public String getJclx() {
        return jclx;
    }

    public void setJclx(String jclx) {
        this.jclx = jclx;
    }

    public String getJcdh() {
        return jcdh;
    }

    public void setJcdh(String jcdh) {
        this.jcdh = jcdh;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public String getJcrq() {
        return jcrq;
    }

    public void setJcrq(String jcrq) {
        this.jcrq = jcrq;
    }

    public String getJczcy() {
        return jczcy;
    }

    public void setJczcy(String jczcy) {
        this.jczcy = jczcy;
    }

    public String getSjbm() {
        return sjbm;
    }

    public void setSjbm(String sjbm) {
        this.sjbm = sjbm;
    }

    public String getYhzp() {
        return yhzp;
    }

    public void setYhzp(String yhzp) {
        this.yhzp = yhzp;
    }

    public Long getJcbid() {
        return jcbid;
    }

    public void setJcbid(Long jcbid) {
        this.jcbid = jcbid;
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