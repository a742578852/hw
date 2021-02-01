package com.information.five.model;

import java.io.Serializable;
import java.util.Date;

/**
 * zyaq_gczinfo
 * @author 
 */
public class ZyaqGczinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 GCZYZ-20200723-1
     */
    private String zyzbh;

    /**
     * 作业证类型(特级高处作业证(h>=30)、一级高处作业证(15<=h<30)、二级高处作业证(5<=h<15)、三级高处作业证(2<=h<5))
     */
    private Integer gczlx;

    /**
     * 申请人
     */
    private String sqr;

    /**
     * 申请部门
     */
    private String sqbm;

    /**
     * 作业内部负责人
     */
    private String zynbfzr;

    /**
     * 作业地点
     */
    private String zydd;

    /**
     * 作业外部负责人
     */
    private String zywbfzr;

    /**
     * 作业高度
     */
    private Integer zygd;

    /**
     * 施工项目
     */
    private String sgxm;

    /**
     * 作业证申请日期
     */
    private String zyzsqrq;

    /**
     * 编制人
     */
    private String bzr;

    /**
     * 实施安全教育人
     */
    private String ssaqjyr;

    /**
     * 作业内容
     */
    private String zynr;

    /**
     * 施工方案
     */
    private String sgfa;

    /**
     * 附件
     */
    private String fj;

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

    public Integer getGczlx() {
        return gczlx;
    }

    public void setGczlx(Integer gczlx) {
        this.gczlx = gczlx;
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

    public String getZynbfzr() {
        return zynbfzr;
    }

    public void setZynbfzr(String zynbfzr) {
        this.zynbfzr = zynbfzr;
    }

    public String getZydd() {
        return zydd;
    }

    public void setZydd(String zydd) {
        this.zydd = zydd;
    }

    public String getZywbfzr() {
        return zywbfzr;
    }

    public void setZywbfzr(String zywbfzr) {
        this.zywbfzr = zywbfzr;
    }

    public Integer getZygd() {
        return zygd;
    }

    public void setZygd(Integer zygd) {
        this.zygd = zygd;
    }

    public String getSgxm() {
        return sgxm;
    }

    public void setSgxm(String sgxm) {
        this.sgxm = sgxm;
    }

    public String getZyzsqrq() {
        return zyzsqrq;
    }

    public void setZyzsqrq(String zyzsqrq) {
        this.zyzsqrq = zyzsqrq;
    }

    public String getBzr() {
        return bzr;
    }

    public void setBzr(String bzr) {
        this.bzr = bzr;
    }

    public String getSsaqjyr() {
        return ssaqjyr;
    }

    public void setSsaqjyr(String ssaqjyr) {
        this.ssaqjyr = ssaqjyr;
    }

    public String getZynr() {
        return zynr;
    }

    public void setZynr(String zynr) {
        this.zynr = zynr;
    }

    public String getSgfa() {
        return sgfa;
    }

    public void setSgfa(String sgfa) {
        this.sgfa = sgfa;
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
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