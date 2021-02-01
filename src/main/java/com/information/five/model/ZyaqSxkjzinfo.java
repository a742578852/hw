package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_sxkjzinfo
 * @author 
 */

public class ZyaqSxkjzinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 SXKJZYZ-20200724-1
     */
    private String zyzbh;

    /**
     * 申请时间
     */
    private String sqrq;

    /**
     * 受限空间(设备)名称
     */
    private String sxkjmc;

    /**
     * 受限空间主要介质
     */
    private String sxkjzyjz;

    /**
     * 作业部门
     */
    private String zybm;

    /**
     * 作业负责人
     */
    private String zyfzr;

    private Integer jhx;

    /**
     * 申请部门
     */
    private String sqbm;

    /**
     * 申请人
     */
    private String sqr;

    /**
     * 安全监护人
     */
    private String aqjhr;

    /**
     * 确认人
     */
    private String qrr;

    /**
     * 受限空间分析人
     */
    private String sxkjfxr;

    /**
     * 施工项目
     */
    private String sgxm;

    /**
     * 电源情况
     */
    private String dyqk;

    /**
     * 作业内容
     */
    private String zynr;

    /**
     * 涉及其他作业证
     */
    private String sjqtzyz;

    /**
     * 监护人
     */
    private String jhr;

    /**
     * 监护人岗位
     */
    private String jhrgw;

    /**
     * 作业期限
     */
    private String zyqx;

    /**
     * 危害辨识
     */
    private String whbs;

    /**
     * 安全措施
     */
    private String aqcs;

    /**
     * 实施情况
     */
    private String ssqk;

    /**
     * 监护情况
     */
    private String jhqk;

    /**
     * 0:部门领导审核 1:属地部门审核 2:安全部门审核 3 公司领导审核 4 实施填报审核  5 属地部门验收
     */
    private Integer shzt;

    private String jdmc;

    private Integer ryid;

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

    public String getZyzbh() {
        return zyzbh;
    }

    public void setZyzbh(String zyzbh) {
        this.zyzbh = zyzbh;
    }

    public String getSqrq() {
        return sqrq;
    }

    public void setSqrq(String sqrq) {
        this.sqrq = sqrq;
    }

    public String getSxkjmc() {
        return sxkjmc;
    }

    public void setSxkjmc(String sxkjmc) {
        this.sxkjmc = sxkjmc;
    }

    public String getSxkjzyjz() {
        return sxkjzyjz;
    }

    public void setSxkjzyjz(String sxkjzyjz) {
        this.sxkjzyjz = sxkjzyjz;
    }

    public String getZybm() {
        return zybm;
    }

    public void setZybm(String zybm) {
        this.zybm = zybm;
    }

    public String getZyfzr() {
        return zyfzr;
    }

    public void setZyfzr(String zyfzr) {
        this.zyfzr = zyfzr;
    }

    public Integer getJhx() {
        return jhx;
    }

    public void setJhx(Integer jhx) {
        this.jhx = jhx;
    }

    public String getSqbm() {
        return sqbm;
    }

    public void setSqbm(String sqbm) {
        this.sqbm = sqbm;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getAqjhr() {
        return aqjhr;
    }

    public void setAqjhr(String aqjhr) {
        this.aqjhr = aqjhr;
    }

    public String getQrr() {
        return qrr;
    }

    public void setQrr(String qrr) {
        this.qrr = qrr;
    }

    public String getSxkjfxr() {
        return sxkjfxr;
    }

    public void setSxkjfxr(String sxkjfxr) {
        this.sxkjfxr = sxkjfxr;
    }

    public String getSgxm() {
        return sgxm;
    }

    public void setSgxm(String sgxm) {
        this.sgxm = sgxm;
    }

    public String getDyqk() {
        return dyqk;
    }

    public void setDyqk(String dyqk) {
        this.dyqk = dyqk;
    }

    public String getZynr() {
        return zynr;
    }

    public void setZynr(String zynr) {
        this.zynr = zynr;
    }

    public String getSjqtzyz() {
        return sjqtzyz;
    }

    public void setSjqtzyz(String sjqtzyz) {
        this.sjqtzyz = sjqtzyz;
    }

    public String getJhr() {
        return jhr;
    }

    public void setJhr(String jhr) {
        this.jhr = jhr;
    }

    public String getJhrgw() {
        return jhrgw;
    }

    public void setJhrgw(String jhrgw) {
        this.jhrgw = jhrgw;
    }

    public String getZyqx() {
        return zyqx;
    }

    public void setZyqx(String zyqx) {
        this.zyqx = zyqx;
    }

    public String getWhbs() {
        return whbs;
    }

    public void setWhbs(String whbs) {
        this.whbs = whbs;
    }

    public String getAqcs() {
        return aqcs;
    }

    public void setAqcs(String aqcs) {
        this.aqcs = aqcs;
    }

    public String getSsqk() {
        return ssqk;
    }

    public void setSsqk(String ssqk) {
        this.ssqk = ssqk;
    }

    public String getJhqk() {
        return jhqk;
    }

    public void setJhqk(String jhqk) {
        this.jhqk = jhqk;
    }

    public Integer getShzt() {
        return shzt;
    }

    public void setShzt(Integer shzt) {
        this.shzt = shzt;
    }

    public String getJdmc() {
        return jdmc;
    }

    public void setJdmc(String jdmc) {
        this.jdmc = jdmc;
    }

    public Integer getRyid() {
        return ryid;
    }

    public void setRyid(Integer ryid) {
        this.ryid = ryid;
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