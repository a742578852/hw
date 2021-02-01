package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_lsydzinfo
 * @author 
 */

public class ZyaqLsydzinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 LSYDZYZ-20200724-1
     */
    private String zyzbh;

    /**
     * 申请日期
     */
    private String sqrq;

    /**
     * 申请单位
     */
    private String sqdw;

    /**
     * 申请人
     */
    private String sqr;

    /**
     * 用电作业单位
     */
    private String ydzydw;

    /**
     * 用电单位负责人
     */
    private String yddwfzr;

    /**
     * 用电人
     */
    private String ydr;

    /**
     * 计划性(计划性、非计划性)
     */
    private Integer jhx;

    /**
     * 监护人
     */
    private String jhr;

    /**
     * 实施安全教育人
     */
    private String ssaqjyr;

    /**
     * 用电设备及功率
     */
    private String ydsbjgl;

    /**
     * 工作电压
     */
    private String gzyl;

    /**
     * 用电区域
     */
    private String ydqy;

    /**
     * 接引设施
     */
    private String jyss;

    /**
     * 施工项目
     */
    private String sgxm;

    /**
     * 临时用电原因
     */
    private String lsydyy;

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
     * 监护人岗位
     */
    private String jhrgw;

    /**
     * 临时用电证有效期
     */
    private String lsydzyxq;

    /**
     * 生产工艺风险危害辨识
     */
    private String whbs;

    /**
     * 消减风险安全措施
     */
    private String aqcs;

    /**
     * 施工作业风险评估危害辨识
     */
    private String pgwhbs;

    /**
     * 施工作业消减风险安全措施
     */
    private String fxaqcs;

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

    public String getYdzydw() {
        return ydzydw;
    }

    public void setYdzydw(String ydzydw) {
        this.ydzydw = ydzydw;
    }

    public String getYddwfzr() {
        return yddwfzr;
    }

    public void setYddwfzr(String yddwfzr) {
        this.yddwfzr = yddwfzr;
    }

    public String getYdr() {
        return ydr;
    }

    public void setYdr(String ydr) {
        this.ydr = ydr;
    }

    public Integer getJhx() {
        return jhx;
    }

    public void setJhx(Integer jhx) {
        this.jhx = jhx;
    }

    public String getJhr() {
        return jhr;
    }

    public void setJhr(String jhr) {
        this.jhr = jhr;
    }

    public String getSsaqjyr() {
        return ssaqjyr;
    }

    public void setSsaqjyr(String ssaqjyr) {
        this.ssaqjyr = ssaqjyr;
    }

    public String getYdsbjgl() {
        return ydsbjgl;
    }

    public void setYdsbjgl(String ydsbjgl) {
        this.ydsbjgl = ydsbjgl;
    }

    public String getGzyl() {
        return gzyl;
    }

    public void setGzyl(String gzyl) {
        this.gzyl = gzyl;
    }

    public String getYdqy() {
        return ydqy;
    }

    public void setYdqy(String ydqy) {
        this.ydqy = ydqy;
    }

    public String getJyss() {
        return jyss;
    }

    public void setJyss(String jyss) {
        this.jyss = jyss;
    }

    public String getSgxm() {
        return sgxm;
    }

    public void setSgxm(String sgxm) {
        this.sgxm = sgxm;
    }

    public String getLsydyy() {
        return lsydyy;
    }

    public void setLsydyy(String lsydyy) {
        this.lsydyy = lsydyy;
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

    public String getJhrgw() {
        return jhrgw;
    }

    public void setJhrgw(String jhrgw) {
        this.jhrgw = jhrgw;
    }

    public String getLsydzyxq() {
        return lsydzyxq;
    }

    public void setLsydzyxq(String lsydzyxq) {
        this.lsydzyxq = lsydzyxq;
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

    public String getPgwhbs() {
        return pgwhbs;
    }

    public void setPgwhbs(String pgwhbs) {
        this.pgwhbs = pgwhbs;
    }

    public String getFxaqcs() {
        return fxaqcs;
    }

    public void setFxaqcs(String fxaqcs) {
        this.fxaqcs = fxaqcs;
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