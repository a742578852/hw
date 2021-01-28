package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * base_bminfo
 * @author 
 */

public class BaseBminfo implements Serializable {
    private Long id;

    /**
     * 部门ID
     */
    private String bmid;

    /**
     * 部门名称
     */
    private String bmmc;

    /**
     * 上级部门
     */
    private String sjbm;

    /**
     * 类型
     */
    private String lx;

    /**
     * 是否启用
     */
    private Integer sfqy;

    /**
     * 备注
     */
    private String bz;

    /**
     * 排序
     */
    private Integer px;

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

    public String getBmid() {
        return bmid;
    }

    public void setBmid(String bmid) {
        this.bmid = bmid;
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    public String getSjbm() {
        return sjbm;
    }

    public void setSjbm(String sjbm) {
        this.sjbm = sjbm;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public Integer getSfqy() {
        return sfqy;
    }

    public void setSfqy(Integer sfqy) {
        this.sfqy = sfqy;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Integer getPx() {
        return px;
    }

    public void setPx(Integer px) {
        this.px = px;
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