package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_dtzinfo
 * @author 
 */

public class ZyaqDtzinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 DTZYZ-20200724-1
     */
    private String zyzbh;

    /**
     * 申请日期
     */
    private String sqrq;

    /**
     * 作业证名称
     */
    private String zyzmc;

    /**
     * 计划性(计划性、非计划性)
     */
    private Integer jhx;

    /**
     * 申请单位
     */
    private String sqdw;

    /**
     * 申请人
     */
    private String sqr;

    /**
     * 作业单位
     */
    private String zydw;

    /**
     * 作业负责人
     */
    private String zyfzr;

    /**
     * 实施安全教育人
     */
    private String ssaqjyr;

    /**
     * 编制人
     */
    private String bzr;

    /**
     * 动土范围
     */
    private String dtfw;

    /**
     * 动土方式
     */
    private String dtfs;

    /**
     * 电源接入点
     */
    private String dyjrd;

    /**
     * 使用电压
     */
    private String sydy;

    /**
     * 施工中项目
     */
    private String sgzxm;

    /**
     * 动土内容(包括深度面积，并附简图)：
     */
    private String dtnr;

    /**
     * 动土简图
     */
    private String dtjt;

    /**
     * 动土地点
     */
    private String dtdd;

    /**
     * 施工方案
     */
    private String sgfa;

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

    public String getZyzmc() {
        return zyzmc;
    }

    public void setZyzmc(String zyzmc) {
        this.zyzmc = zyzmc;
    }

    public Integer getJhx() {
        return jhx;
    }

    public void setJhx(Integer jhx) {
        this.jhx = jhx;
    }

    public String getSqdw() {
        return sqdw;
    }

    public void setSqdw(String sqdw) {
        this.sqdw = sqdw;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getZydw() {
        return zydw;
    }

    public void setZydw(String zydw) {
        this.zydw = zydw;
    }

    public String getZyfzr() {
        return zyfzr;
    }

    public void setZyfzr(String zyfzr) {
        this.zyfzr = zyfzr;
    }

    public String getSsaqjyr() {
        return ssaqjyr;
    }

    public void setSsaqjyr(String ssaqjyr) {
        this.ssaqjyr = ssaqjyr;
    }

    public String getBzr() {
        return bzr;
    }

    public void setBzr(String bzr) {
        this.bzr = bzr;
    }

    public String getDtfw() {
        return dtfw;
    }

    public void setDtfw(String dtfw) {
        this.dtfw = dtfw;
    }

    public String getDtfs() {
        return dtfs;
    }

    public void setDtfs(String dtfs) {
        this.dtfs = dtfs;
    }

    public String getDyjrd() {
        return dyjrd;
    }

    public void setDyjrd(String dyjrd) {
        this.dyjrd = dyjrd;
    }

    public String getSydy() {
        return sydy;
    }

    public void setSydy(String sydy) {
        this.sydy = sydy;
    }

    public String getSgzxm() {
        return sgzxm;
    }

    public void setSgzxm(String sgzxm) {
        this.sgzxm = sgzxm;
    }

    public String getDtnr() {
        return dtnr;
    }

    public void setDtnr(String dtnr) {
        this.dtnr = dtnr;
    }

    public String getDtjt() {
        return dtjt;
    }

    public void setDtjt(String dtjt) {
        this.dtjt = dtjt;
    }

    public String getDtdd() {
        return dtdd;
    }

    public void setDtdd(String dtdd) {
        this.dtdd = dtdd;
    }

    public String getSgfa() {
        return sgfa;
    }

    public void setSgfa(String sgfa) {
        this.sgfa = sgfa;
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