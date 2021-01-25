package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * fxyp_ypnrinfo 研判内容
 * @author 
 */

public class FxypYpnrinfo implements Serializable {
    private Long id;

    /**
     * 班组级风险研判ID
     */
    private Long bzjid;

    private Long cjid;

    private Long gsid;

    /**
     * 序号
     */
    private Integer xh;

    /**
     * 研判结果 不涉及、是、否
     */
    private String ypjg;

    /**
     * 管控措施
     */
    private String gkcs;

    private String ypnr;

    private String yplb;

    /**
     * 备注
     */
    private String bz;

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

    public Long getBzjid() {
        return bzjid;
    }

    public void setBzjid(Long bzjid) {
        this.bzjid = bzjid;
    }

    public Long getCjid() {
        return cjid;
    }

    public void setCjid(Long cjid) {
        this.cjid = cjid;
    }

    public Long getGsid() {
        return gsid;
    }

    public void setGsid(Long gsid) {
        this.gsid = gsid;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getYpjg() {
        return ypjg;
    }

    public void setYpjg(String ypjg) {
        this.ypjg = ypjg;
    }

    public String getGkcs() {
        return gkcs;
    }

    public void setGkcs(String gkcs) {
        this.gkcs = gkcs;
    }

    public String getYpnr() {
        return ypnr;
    }

    public void setYpnr(String ypnr) {
        this.ypnr = ypnr;
    }

    public String getYplb() {
        return yplb;
    }

    public void setYplb(String yplb) {
        this.yplb = yplb;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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