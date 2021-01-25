package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * fxyp_cjypjlinfo 车间风险研判
 * @author 
 */

public class FxypCjypjlinfo implements Serializable {
    private Long id;

    /**
     * 部门
     */
    private String bm;

    /**
     * 上报时间
     */
    private String sbsj;

    /**
     * 上报人
     */
    private String sbr;

    /**
     * 生产装置
     */
    private Integer sczz;

    /**
     * 其中运行
     */
    private Integer qzyx;

    /**
     * 停产
     */
    private Integer tc;

    /**
     * 检修
     */
    private Integer jx;

    /**
     * 一级动火作业
     */
    private Integer yj;

    /**
     * 二级动火作业
     */
    private Integer ej;

    /**
     * 特级动火作业
     */
    private Integer tj;

    /**
     * 受限空间作业
     */
    private Integer kjzy;

    /**
     * 高处作业
     */
    private Integer gczy;

    /**
     * 其他特殊作业
     */
    private Integer tszy;

    /**
     * 是否处于试生产(是、否)
     */
    private String ssc;

    /**
     * 是否处于开停车状态(是、否)
     */
    private String tczt;

    /**
     * 罐区、仓库等重大危险源是否处于安全状态(是、否)
     */
    private String aqzt;

    /**
     * 班组
     */
    private String bz;

    /**
     * 上报人
     */
    private String bzsbr;

    /**
     * 上报时间
     */
    private String bzsbsj;

    /**
     * 汇总状态
     */
    private Integer hzzt;

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

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    public String getSbsj() {
        return sbsj;
    }

    public void setSbsj(String sbsj) {
        this.sbsj = sbsj;
    }

    public String getSbr() {
        return sbr;
    }

    public void setSbr(String sbr) {
        this.sbr = sbr;
    }

    public Integer getSczz() {
        return sczz;
    }

    public void setSczz(Integer sczz) {
        this.sczz = sczz;
    }

    public Integer getQzyx() {
        return qzyx;
    }

    public void setQzyx(Integer qzyx) {
        this.qzyx = qzyx;
    }

    public Integer getTc() {
        return tc;
    }

    public void setTc(Integer tc) {
        this.tc = tc;
    }

    public Integer getJx() {
        return jx;
    }

    public void setJx(Integer jx) {
        this.jx = jx;
    }

    public Integer getYj() {
        return yj;
    }

    public void setYj(Integer yj) {
        this.yj = yj;
    }

    public Integer getEj() {
        return ej;
    }

    public void setEj(Integer ej) {
        this.ej = ej;
    }

    public Integer getTj() {
        return tj;
    }

    public void setTj(Integer tj) {
        this.tj = tj;
    }

    public Integer getKjzy() {
        return kjzy;
    }

    public void setKjzy(Integer kjzy) {
        this.kjzy = kjzy;
    }

    public Integer getGczy() {
        return gczy;
    }

    public void setGczy(Integer gczy) {
        this.gczy = gczy;
    }

    public Integer getTszy() {
        return tszy;
    }

    public void setTszy(Integer tszy) {
        this.tszy = tszy;
    }

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    public String getTczt() {
        return tczt;
    }

    public void setTczt(String tczt) {
        this.tczt = tczt;
    }

    public String getAqzt() {
        return aqzt;
    }

    public void setAqzt(String aqzt) {
        this.aqzt = aqzt;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getBzsbr() {
        return bzsbr;
    }

    public void setBzsbr(String bzsbr) {
        this.bzsbr = bzsbr;
    }

    public String getBzsbsj() {
        return bzsbsj;
    }

    public void setBzsbsj(String bzsbsj) {
        this.bzsbsj = bzsbsj;
    }

    public Integer getHzzt() {
        return hzzt;
    }

    public void setHzzt(Integer hzzt) {
        this.hzzt = hzzt;
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