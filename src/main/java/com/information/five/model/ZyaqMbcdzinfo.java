package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_mbcdzinfo
 * @author 
 */

public class ZyaqMbcdzinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 MBCDZYZ-20200724-1
     */
    private String zyzbh;

    /**
     * 作业证名称
     */
    private String zyzmc;

    /**
     * 申请日期
     */
    private String sqrq;

    /**
     * 申请人
     */
    private String sqr;

    /**
     * 申请部门
     */
    private String sqbm;

    /**
     * 计划性(计划性、非计划性)
     */
    private Integer jhx;

    /**
     * 编制人
     */
    private String bzr;

    /**
     * 装盲板负责人
     */
    private String zmbfzr;

    /**
     * 装盲板时间
     */
    private String zmbsj;

    /**
     * 拆盲板负责人
     */
    private String cmbfzr;

    /**
     * 拆盲板时间
     */
    private String cmbsj;

    /**
     * 附件
     */
    private String fj;

    /**
     * 生产车间
     */
    private String sccj;

    /**
     * 设备管线名称
     */
    private String sbgxmc;

    /**
     * 主要介质
     */
    private String zyjz;

    /**
     * 温度
     */
    private String wd;

    /**
     * 压力
     */
    private String yl;

    /**
     * 盲板材质
     */
    private String mbcz;

    /**
     * 盲板规格
     */
    private String mbgg;

    /**
     * 盲板编号
     */
    private String mbbh;

    /**
     * 施工项目
     */
    private String sgxm;

    /**
     * 涉及其他作业证
     */
    private String sjqtzyz;

    /**
     * 盲板位置图(附件)
     */
    private String mbwzt;

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

    public String getZyzmc() {
        return zyzmc;
    }

    public void setZyzmc(String zyzmc) {
        this.zyzmc = zyzmc;
    }

    public String getSqrq() {
        return sqrq;
    }

    public void setSqrq(String sqrq) {
        this.sqrq = sqrq;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getSqbm() {
        return sqbm;
    }

    public void setSqbm(String sqbm) {
        this.sqbm = sqbm;
    }

    public Integer getJhx() {
        return jhx;
    }

    public void setJhx(Integer jhx) {
        this.jhx = jhx;
    }

    public String getBzr() {
        return bzr;
    }

    public void setBzr(String bzr) {
        this.bzr = bzr;
    }

    public String getZmbfzr() {
        return zmbfzr;
    }

    public void setZmbfzr(String zmbfzr) {
        this.zmbfzr = zmbfzr;
    }

    public String getZmbsj() {
        return zmbsj;
    }

    public void setZmbsj(String zmbsj) {
        this.zmbsj = zmbsj;
    }

    public String getCmbfzr() {
        return cmbfzr;
    }

    public void setCmbfzr(String cmbfzr) {
        this.cmbfzr = cmbfzr;
    }

    public String getCmbsj() {
        return cmbsj;
    }

    public void setCmbsj(String cmbsj) {
        this.cmbsj = cmbsj;
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
    }

    public String getSccj() {
        return sccj;
    }

    public void setSccj(String sccj) {
        this.sccj = sccj;
    }

    public String getSbgxmc() {
        return sbgxmc;
    }

    public void setSbgxmc(String sbgxmc) {
        this.sbgxmc = sbgxmc;
    }

    public String getZyjz() {
        return zyjz;
    }

    public void setZyjz(String zyjz) {
        this.zyjz = zyjz;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getYl() {
        return yl;
    }

    public void setYl(String yl) {
        this.yl = yl;
    }

    public String getMbcz() {
        return mbcz;
    }

    public void setMbcz(String mbcz) {
        this.mbcz = mbcz;
    }

    public String getMbgg() {
        return mbgg;
    }

    public void setMbgg(String mbgg) {
        this.mbgg = mbgg;
    }

    public String getMbbh() {
        return mbbh;
    }

    public void setMbbh(String mbbh) {
        this.mbbh = mbbh;
    }

    public String getSgxm() {
        return sgxm;
    }

    public void setSgxm(String sgxm) {
        this.sgxm = sgxm;
    }

    public String getSjqtzyz() {
        return sjqtzyz;
    }

    public void setSjqtzyz(String sjqtzyz) {
        this.sjqtzyz = sjqtzyz;
    }

    public String getMbwzt() {
        return mbwzt;
    }

    public void setMbwzt(String mbwzt) {
        this.mbwzt = mbwzt;
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