package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * fxbs_fxsbinfo
 * @author 
 */

public class FxbsFxsbinfo implements Serializable {
    private Long id;

    /**
     * 风险位置
     */
    private String fxwz;

    /**
     * 风险描述
     */
    private String fxms;

    /**
     * 风险因素 人、机、料、法、环、管
     */
    private String fxys;

    /**
     * 发现人姓名
     */
    private String fxrxm;

    /**
     * 发现日期
     */
    private String fxrq;

    /**
     * 附件
     */
    private String fj;

    /**
     * 创建时间
     */
    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFxwz() {
        return fxwz;
    }

    public void setFxwz(String fxwz) {
        this.fxwz = fxwz;
    }

    public String getFxms() {
        return fxms;
    }

    public void setFxms(String fxms) {
        this.fxms = fxms;
    }

    public String getFxys() {
        return fxys;
    }

    public void setFxys(String fxys) {
        this.fxys = fxys;
    }

    public String getFxrxm() {
        return fxrxm;
    }

    public void setFxrxm(String fxrxm) {
        this.fxrxm = fxrxm;
    }

    public String getFxrq() {
        return fxrq;
    }

    public void setFxrq(String fxrq) {
        this.fxrq = fxrq;
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
}