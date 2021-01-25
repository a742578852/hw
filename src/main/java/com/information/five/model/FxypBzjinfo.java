package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * fxyp_bzjinfo 班组级风险研判
 * @author 
 */

public class FxypBzjinfo implements Serializable {
    private Long id;

    /**
     * 班组
     */
    private String bz;

    /**
     * 填报人
     */
    private String tbr;

    private Long cjid;

    private String cj;

    private Long gsid;

    private String gs;

    private String tbrq;

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

    public Long getCjid() {
        return cjid;
    }

    public void setCjid(Long cjid) {
        this.cjid = cjid;
    }

    public String getCj() {
        return cj;
    }

    public void setCj(String cj) {
        this.cj = cj;
    }

    public Long getGsid() {
        return gsid;
    }

    public void setGsid(Long gsid) {
        this.gsid = gsid;
    }

    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }

    public String getTbrq() {
        return tbrq;
    }

    public void setTbrq(String tbrq) {
        this.tbrq = tbrq;
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