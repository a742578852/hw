package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_dlzinfo
 * @author 
 */

public class ZyaqDlzinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 DLZYZ-20200724-1
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
     * 申请人
     */
    private String sqr;

    /**
     * 申请部门
     */
    private String sqbm;

    /**
     * 作业单位
     */
    private String zydw;

    /**
     * 计划性(计划性、非计划性)
     */
    private Integer jhx;

    /**
     * 编制人
     */
    private String bzr;

    /**
     * 作业单位监护人
     */
    private String zydwjhr;

    /**
     * 作业单位负责人
     */
    private String zydwfzr;

    /**
     * 断路作业地段
     */
    private String dlzydd;

    /**
     * 断路作业地点
     */
    private String dlzydid;

    /**
     * 实施安全教育人
     */
    private String ssaqjyr;

    /**
     * 恢复日期
     */
    private String fhrq;

    /**
     * 断路地段示意图（附件）
     */
    private String dlddsyt;

    /**
     * 附件
     */
    private String fj;

    /**
     * 施工项目
     */
    private String sgxm;

    /**
     * 断路作业原因
     */
    private String dlzyyy;

    /**
     * 临时用电原因
     */
    private String lsydyy;

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

    public String getZydw() {
        return zydw;
    }

    public void setZydw(String zydw) {
        this.zydw = zydw;
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

    public String getZydwjhr() {
        return zydwjhr;
    }

    public void setZydwjhr(String zydwjhr) {
        this.zydwjhr = zydwjhr;
    }

    public String getZydwfzr() {
        return zydwfzr;
    }

    public void setZydwfzr(String zydwfzr) {
        this.zydwfzr = zydwfzr;
    }

    public String getDlzydd() {
        return dlzydd;
    }

    public void setDlzydd(String dlzydd) {
        this.dlzydd = dlzydd;
    }

    public String getDlzydid() {
        return dlzydid;
    }

    public void setDlzydid(String dlzydid) {
        this.dlzydid = dlzydid;
    }

    public String getSsaqjyr() {
        return ssaqjyr;
    }

    public void setSsaqjyr(String ssaqjyr) {
        this.ssaqjyr = ssaqjyr;
    }

    public String getFhrq() {
        return fhrq;
    }

    public void setFhrq(String fhrq) {
        this.fhrq = fhrq;
    }

    public String getDlddsyt() {
        return dlddsyt;
    }

    public void setDlddsyt(String dlddsyt) {
        this.dlddsyt = dlddsyt;
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
    }

    public String getSgxm() {
        return sgxm;
    }

    public void setSgxm(String sgxm) {
        this.sgxm = sgxm;
    }

    public String getDlzyyy() {
        return dlzyyy;
    }

    public void setDlzyyy(String dlzyyy) {
        this.dlzyyy = dlzyyy;
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