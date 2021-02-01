package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * zyaq_dzzinfo
 * @author 
 */

public class ZyaqDzzinfo implements Serializable {
    private Long id;

    /**
     * 作业证编号 DZZYZ-20200724-1
     */
    private String zyzbh;

    /**
     * 作业证类型(一级吊装作业证、二级吊装作业证、三级吊装作业证)
     */
    private Integer dzzlx;

    /**
     * 申请部门
     */
    private String sqbm;

    /**
     * 负责人
     */
    private String fzr;

    /**
     * 作业证申请人
     */
    private String zyzfzr;

    /**
     * 作业证申请日期
     */
    private String zyzsqrq;

    /**
     * 实施安全教育人
     */
    private String ssaqjyr;

    /**
     * 编制人
     */
    private String bzr;

    /**
     * 吊装地点
     */
    private String dzdd;

    /**
     * 吊车车牌号
     */
    private String dccph;

    /**
     * 起吊重物质量(t)
     */
    private Double qdzwzl;

    /**
     * 最大起重量(t)
     */
    private Double zdqzl;

    /**
     * 施工项目
     */
    private String sgxm;

    /**
     * 吊装内容
     */
    private String dznr;

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
     * 安全监护人
     */
    private String aqjhr;

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

    public Integer getDzzlx() {
        return dzzlx;
    }

    public void setDzzlx(Integer dzzlx) {
        this.dzzlx = dzzlx;
    }

    public String getSqbm() {
        return sqbm;
    }

    public void setSqbm(String sqbm) {
        this.sqbm = sqbm;
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public String getZyzfzr() {
        return zyzfzr;
    }

    public void setZyzfzr(String zyzfzr) {
        this.zyzfzr = zyzfzr;
    }

    public String getZyzsqrq() {
        return zyzsqrq;
    }

    public void setZyzsqrq(String zyzsqrq) {
        this.zyzsqrq = zyzsqrq;
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

    public String getDzdd() {
        return dzdd;
    }

    public void setDzdd(String dzdd) {
        this.dzdd = dzdd;
    }

    public String getDccph() {
        return dccph;
    }

    public void setDccph(String dccph) {
        this.dccph = dccph;
    }

    public Double getQdzwzl() {
        return qdzwzl;
    }

    public void setQdzwzl(Double qdzwzl) {
        this.qdzwzl = qdzwzl;
    }

    public Double getZdqzl() {
        return zdqzl;
    }

    public void setZdqzl(Double zdqzl) {
        this.zdqzl = zdqzl;
    }

    public String getSgxm() {
        return sgxm;
    }

    public void setSgxm(String sgxm) {
        this.sgxm = sgxm;
    }

    public String getDznr() {
        return dznr;
    }

    public void setDznr(String dznr) {
        this.dznr = dznr;
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

    public String getAqjhr() {
        return aqjhr;
    }

    public void setAqjhr(String aqjhr) {
        this.aqjhr = aqjhr;
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