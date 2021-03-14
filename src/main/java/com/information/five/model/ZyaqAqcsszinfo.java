package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_aqcsszinfo
 * @author 
 */

public class ZyaqAqcsszinfo implements Serializable {
    private Long id;

    /**
     * 作业证名称（动火作业证、高处作业证、受限空间作业证、吊装作业证、临时用电作业证、动土作业证、盲板抽堵作业证、断路作业证）
     */
    private String zyzmc;

    /**
     * 序号
     */
    private Integer xh;

    /**
     * 风险因素
     */
    private String fxys;

    /**
     * 安全措施
     */
    private String aqcs;

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

    public String getZyzmc() {
        return zyzmc;
    }

    public void setZyzmc(String zyzmc) {
        this.zyzmc = zyzmc;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getFxys() {
        return fxys;
    }

    public void setFxys(String fxys) {
        this.fxys = fxys;
    }

    public String getAqcs() {
        return aqcs;
    }

    public void setAqcs(String aqcs) {
        this.aqcs = aqcs;
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