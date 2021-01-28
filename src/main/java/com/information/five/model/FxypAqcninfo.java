package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * fxyp_aqcninfo 风险承诺
 * @author 
 */

public class FxypAqcninfo implements Serializable {
    private Long id;

    /**
     * 班组级ID
     */
    private Long bzjid;

    private Long cjid;

    private Long gsid;

    private String tbrq;

    private String tbr;

    /**
     * 班组名称
     */
    private String bmmc;

    /**
     * 研判风险点
     */
    private Integer fxd;

    /**
     * 各风险点风险研判结果落实相应的风险管控措施(是、否)
     */
    private String fxgk;

    /**
     * 特殊作业的风险辨识、作业许可及管控落实情况(是、否)
     */
    private String lscs;

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
    private Integer sx;

    /**
     * 高处作业
     */
    private Integer gc;

    /**
     * 其他特殊作业
     */
    private Integer ts;

    /**
     * 处于试生产情况(是、否)
     */
    private String ssc;

    /**
     * 处于开停车状态情况(是、否)
     */
    private String ktc;

    /**
     * 承包商作业管控情况(受控、非受控)
     */
    private String cbs;

    /**
     * 变更情况是否存在(是、否)
     */
    private String bg;

    /**
     * 落实审批程序情况(是、否)
     */
    private String lssp;

    /**
     * 班组岗位
     */
    private Integer bzgw;

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
     * 温度/压力/危化品/液位/流量等工艺参数处于指标范围(是、否)
     */
    private String zbfw;

    /**
     * 特种设备安全运行(是、否)
     */
    private String aqyx;

    /**
     * 设备设施完好无泄漏(是、否)
     */
    private String wxl;

    /**
     * 超限报警、紧急切断、连锁等各类安全设施配备完好投用，并可靠运行(是、否)
     */
    private String kkyx;

    /**
     * 储罐、管道、机泵、阀门及仪表系统完好无泄漏(是、否)
     */
    private String whwxl;

    /**
     * 储罐的液位、温度、压力无超限运行(是、否)
     */
    private String cxyx;

    /**
     * 装卸车时确保人员在岗(是、否)
     */
    private String ryzg;

    /**
     * 可燃及有毒气体报警和联锁处于可靠运行状态(是、否)
     */
    private String yxzt;

    /**
     * 仓库按照国家标准分区分类储存危险化学品，无超量、超品种储存，相互禁配物质无混放混存(是、否)
     */
    private String hfhc;

    /**
     * 班组负责人
     */
    private String bzfzr;

    /**
     * 日期
     */
    private String rq;

    /**
     * 附件
     */
    private String fj;

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

    public String getTbrq() {
        return tbrq;
    }

    public void setTbrq(String tbrq) {
        this.tbrq = tbrq;
    }

    public String getTbr() {
        return tbr;
    }

    public void setTbr(String tbr) {
        this.tbr = tbr;
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    public Integer getFxd() {
        return fxd;
    }

    public void setFxd(Integer fxd) {
        this.fxd = fxd;
    }

    public String getFxgk() {
        return fxgk;
    }

    public void setFxgk(String fxgk) {
        this.fxgk = fxgk;
    }

    public String getLscs() {
        return lscs;
    }

    public void setLscs(String lscs) {
        this.lscs = lscs;
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

    public Integer getSx() {
        return sx;
    }

    public void setSx(Integer sx) {
        this.sx = sx;
    }

    public Integer getGc() {
        return gc;
    }

    public void setGc(Integer gc) {
        this.gc = gc;
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    public String getKtc() {
        return ktc;
    }

    public void setKtc(String ktc) {
        this.ktc = ktc;
    }

    public String getCbs() {
        return cbs;
    }

    public void setCbs(String cbs) {
        this.cbs = cbs;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getLssp() {
        return lssp;
    }

    public void setLssp(String lssp) {
        this.lssp = lssp;
    }

    public Integer getBzgw() {
        return bzgw;
    }

    public void setBzgw(Integer bzgw) {
        this.bzgw = bzgw;
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

    public String getZbfw() {
        return zbfw;
    }

    public void setZbfw(String zbfw) {
        this.zbfw = zbfw;
    }

    public String getAqyx() {
        return aqyx;
    }

    public void setAqyx(String aqyx) {
        this.aqyx = aqyx;
    }

    public String getWxl() {
        return wxl;
    }

    public void setWxl(String wxl) {
        this.wxl = wxl;
    }

    public String getKkyx() {
        return kkyx;
    }

    public void setKkyx(String kkyx) {
        this.kkyx = kkyx;
    }

    public String getWhwxl() {
        return whwxl;
    }

    public void setWhwxl(String whwxl) {
        this.whwxl = whwxl;
    }

    public String getCxyx() {
        return cxyx;
    }

    public void setCxyx(String cxyx) {
        this.cxyx = cxyx;
    }

    public String getRyzg() {
        return ryzg;
    }

    public void setRyzg(String ryzg) {
        this.ryzg = ryzg;
    }

    public String getYxzt() {
        return yxzt;
    }

    public void setYxzt(String yxzt) {
        this.yxzt = yxzt;
    }

    public String getHfhc() {
        return hfhc;
    }

    public void setHfhc(String hfhc) {
        this.hfhc = hfhc;
    }

    public String getBzfzr() {
        return bzfzr;
    }

    public void setBzfzr(String bzfzr) {
        this.bzfzr = bzfzr;
    }

    public String getRq() {
        return rq;
    }

    public void setRq(String rq) {
        this.rq = rq;
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
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