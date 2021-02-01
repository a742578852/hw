package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_dhzinfo
 * @author 
 */

public class ZyaqDhzinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 DHZYZ-20200723-1
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
     * 内部作业单位负责人
     */
    private String nbzydwfzr;

    /**
     * 申请人
     */
    private String sqr;

    /**
     * 动火地点
     */
    private String dhdd;

    /**
     * 动火方式
     */
    private String dhfs;

    /**
     * 动火分析人
     */
    private String dhfxr;

    /**
     * 施工项目
     */
    private String sgxm;

    /**
     * 施工负责人
     */
    private String sgfzr;

    /**
     * 动火证类型(特殊动火作业证、一级动火作业证、二级动火作业证)
     */
    private Integer dhzlx;

    /**
     * 计划性(非计划性、计划性)
     */
    private Integer jhx;

    /**
     * 实施安全教育人
     */
    private String ssaqjyr;

    /**
     * 包含外部单位(是、否)
     */
    private String bhwbdw;

    /**
     * 外部作业单位
     */
    private String wbzydw;

    /**
     * 外部作业单位负责人
     */
    private String wbzydwfzr;

    /**
     * 动火内容
     */
    private String dhnr;

    /**
     * 施工方案
     */
    private String sgfa;

    /**
     * 涉及其他作业证
     */
    private String sjqtzyz;

    /**
     * 监火人
     */
    private String jhr;

    /**
     * 监火人岗位
     */
    private String jhrgw;

    /**
     * 动火期限 上午
     */
    private String dhqxsw;

    /**
     * 动火期限 下午
     */
    private String dhqxxw;

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

    public String getSqdw() {
        return sqdw;
    }

    public void setSqdw(String sqdw) {
        this.sqdw = sqdw;
    }

    public String getNbzydwfzr() {
        return nbzydwfzr;
    }

    public void setNbzydwfzr(String nbzydwfzr) {
        this.nbzydwfzr = nbzydwfzr;
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr;
    }

    public String getDhdd() {
        return dhdd;
    }

    public void setDhdd(String dhdd) {
        this.dhdd = dhdd;
    }

    public String getDhfs() {
        return dhfs;
    }

    public void setDhfs(String dhfs) {
        this.dhfs = dhfs;
    }

    public String getDhfxr() {
        return dhfxr;
    }

    public void setDhfxr(String dhfxr) {
        this.dhfxr = dhfxr;
    }

    public String getSgxm() {
        return sgxm;
    }

    public void setSgxm(String sgxm) {
        this.sgxm = sgxm;
    }

    public String getSgfzr() {
        return sgfzr;
    }

    public void setSgfzr(String sgfzr) {
        this.sgfzr = sgfzr;
    }

    public Integer getDhzlx() {
        return dhzlx;
    }

    public void setDhzlx(Integer dhzlx) {
        this.dhzlx = dhzlx;
    }

    public Integer getJhx() {
        return jhx;
    }

    public void setJhx(Integer jhx) {
        this.jhx = jhx;
    }

    public String getSsaqjyr() {
        return ssaqjyr;
    }

    public void setSsaqjyr(String ssaqjyr) {
        this.ssaqjyr = ssaqjyr;
    }

    public String getBhwbdw() {
        return bhwbdw;
    }

    public void setBhwbdw(String bhwbdw) {
        this.bhwbdw = bhwbdw;
    }

    public String getWbzydw() {
        return wbzydw;
    }

    public void setWbzydw(String wbzydw) {
        this.wbzydw = wbzydw;
    }

    public String getWbzydwfzr() {
        return wbzydwfzr;
    }

    public void setWbzydwfzr(String wbzydwfzr) {
        this.wbzydwfzr = wbzydwfzr;
    }

    public String getDhnr() {
        return dhnr;
    }

    public void setDhnr(String dhnr) {
        this.dhnr = dhnr;
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

    public String getDhqxsw() {
        return dhqxsw;
    }

    public void setDhqxsw(String dhqxsw) {
        this.dhqxsw = dhqxsw;
    }

    public String getDhqxxw() {
        return dhqxxw;
    }

    public void setDhqxxw(String dhqxxw) {
        this.dhqxxw = dhqxxw;
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