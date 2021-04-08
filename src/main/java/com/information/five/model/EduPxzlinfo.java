package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * edu_pxzlinfo
 * @author 
 */

public class EduPxzlinfo implements Serializable {
    private Long id;

    /**
     * 上传时间
     */
    private String scsj;

    /**
     * 上传部门
     */
    private String scbm;

    /**
     * 标题
     */
    private String bt;

    /**
     * 所属类型
     */
    private String sslx;

    /**
     * 关键字
     */
    private String gjz;

    /**
     * 备注
     */
    private String bz;

    /**
     * 附件
     */
    private String fj;

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

    public String getScsj() {
        return scsj;
    }

    public void setScsj(String scsj) {
        this.scsj = scsj;
    }

    public String getScbm() {
        return scbm;
    }

    public void setScbm(String scbm) {
        this.scbm = scbm;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
    }

    public String getSslx() {
        return sslx;
    }

    public void setSslx(String sslx) {
        this.sslx = sslx;
    }

    public String getGjz() {
        return gjz;
    }

    public void setGjz(String gjz) {
        this.gjz = gjz;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
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