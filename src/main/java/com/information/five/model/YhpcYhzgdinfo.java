package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * yhpc_yhzgdinfo
 * @author 
 */

public class YhpcYhzgdinfo implements Serializable {
    private Long id;

    /**
     * 风险上报ID
     */
    private Long fxsbid;

    /**
     * 整改单编号 YHZGD-2020-0001
     */
    private String zgdbh;

    /**
     * 隐患所在地
     */
    private String yhszd;

    /**
     * 隐患等级 一般隐患、重大隐患
     */
    private String yhdj;

    /**
     * 隐患后果 死亡、重伤、轻伤、火灾、爆炸、交通事故、财产损失、其他
     */
    private String yhhg;

    /**
     * 不合格因素
     */
    private String bhgys;

    /**
     * 整改要求
     */
    private String zgyq;

    /**
     * 发现人
     */
    private String fxr;

    /**
     * 发现日期
     */
    private String fxrq;

    /**
     * 是否现场整改(是、否)
     */
    private String sfxczg;

    /**
     * 整改期限
     */
    private String zgqx;

    /**
     * 责任部门
     */
    private String zrbm;

    /**
     * 填报日期
     */
    private String tbrq;

    /**
     * 填报人
     */
    private String tbr;

    /**
     * 填报人部门
     */
    private String tbrbm;

    /**
     * 隐患照片
     */
    private String yhzp;

    /**
     * 提交整改人
     */
    private String tjzgr;

    /**
     * 整改情况
     */
    private String zgqk;

    /**
     * 类型选择 人、机、料、法、环、管
     */
    private String lx;

    /**
     * 原因分析
     */
    private String yyfx;

    /**
     * 整改完成日期
     */
    private String zgwcrq;

    /**
     * 治理资金(元)
     */
    private Integer zlzj;

    /**
     * 填报人-整改
     */
    private String zgtbr;

    /**
     * 接受日期
     */
    private String jsrq;

    /**
     * 整改照片
     */
    private String zgzp;

    /**
     * 提交验证人
     */
    private String tjyzr;

    /**
     * 验证情况
     */
    private String yzqk;

    /**
     * 验证照片
     */
    private String yzzp;

    /**
     * 验证人
     */
    private String yzr;

    /**
     * 验证日期
     */
    private String yzrq;

    /**
     * 提交审核人
     */
    private String tjshr;

    /**
     * 审核人
     */
    private String shr;

    /**
     * 领导审核意见
     */
    private String ldshyj;

    private Integer shzt;

    private String jdmc;

    private Integer ryid;

    private String ly;

    private Long lyid;

    private String yhlb;

    /**
     * 创建时间
     */
    private Date createdAt;

    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFxsbid() {
        return fxsbid;
    }

    public void setFxsbid(Long fxsbid) {
        this.fxsbid = fxsbid;
    }

    public String getZgdbh() {
        return zgdbh;
    }

    public void setZgdbh(String zgdbh) {
        this.zgdbh = zgdbh;
    }

    public String getYhszd() {
        return yhszd;
    }

    public void setYhszd(String yhszd) {
        this.yhszd = yhszd;
    }

    public String getYhdj() {
        return yhdj;
    }

    public void setYhdj(String yhdj) {
        this.yhdj = yhdj;
    }

    public String getYhhg() {
        return yhhg;
    }

    public void setYhhg(String yhhg) {
        this.yhhg = yhhg;
    }

    public String getBhgys() {
        return bhgys;
    }

    public void setBhgys(String bhgys) {
        this.bhgys = bhgys;
    }

    public String getZgyq() {
        return zgyq;
    }

    public void setZgyq(String zgyq) {
        this.zgyq = zgyq;
    }

    public String getFxr() {
        return fxr;
    }

    public void setFxr(String fxr) {
        this.fxr = fxr;
    }

    public String getFxrq() {
        return fxrq;
    }

    public void setFxrq(String fxrq) {
        this.fxrq = fxrq;
    }

    public String getSfxczg() {
        return sfxczg;
    }

    public void setSfxczg(String sfxczg) {
        this.sfxczg = sfxczg;
    }

    public String getZgqx() {
        return zgqx;
    }

    public void setZgqx(String zgqx) {
        this.zgqx = zgqx;
    }

    public String getZrbm() {
        return zrbm;
    }

    public void setZrbm(String zrbm) {
        this.zrbm = zrbm;
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

    public String getTbrbm() {
        return tbrbm;
    }

    public void setTbrbm(String tbrbm) {
        this.tbrbm = tbrbm;
    }

    public String getYhzp() {
        return yhzp;
    }

    public void setYhzp(String yhzp) {
        this.yhzp = yhzp;
    }

    public String getTjzgr() {
        return tjzgr;
    }

    public void setTjzgr(String tjzgr) {
        this.tjzgr = tjzgr;
    }

    public String getZgqk() {
        return zgqk;
    }

    public void setZgqk(String zgqk) {
        this.zgqk = zgqk;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getYyfx() {
        return yyfx;
    }

    public void setYyfx(String yyfx) {
        this.yyfx = yyfx;
    }

    public String getZgwcrq() {
        return zgwcrq;
    }

    public void setZgwcrq(String zgwcrq) {
        this.zgwcrq = zgwcrq;
    }

    public Integer getZlzj() {
        return zlzj;
    }

    public void setZlzj(Integer zlzj) {
        this.zlzj = zlzj;
    }

    public String getZgtbr() {
        return zgtbr;
    }

    public void setZgtbr(String zgtbr) {
        this.zgtbr = zgtbr;
    }

    public String getJsrq() {
        return jsrq;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    public String getZgzp() {
        return zgzp;
    }

    public void setZgzp(String zgzp) {
        this.zgzp = zgzp;
    }

    public String getTjyzr() {
        return tjyzr;
    }

    public void setTjyzr(String tjyzr) {
        this.tjyzr = tjyzr;
    }

    public String getYzqk() {
        return yzqk;
    }

    public void setYzqk(String yzqk) {
        this.yzqk = yzqk;
    }

    public String getYzzp() {
        return yzzp;
    }

    public void setYzzp(String yzzp) {
        this.yzzp = yzzp;
    }

    public String getYzr() {
        return yzr;
    }

    public void setYzr(String yzr) {
        this.yzr = yzr;
    }

    public String getYzrq() {
        return yzrq;
    }

    public void setYzrq(String yzrq) {
        this.yzrq = yzrq;
    }

    public String getTjshr() {
        return tjshr;
    }

    public void setTjshr(String tjshr) {
        this.tjshr = tjshr;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public String getLdshyj() {
        return ldshyj;
    }

    public void setLdshyj(String ldshyj) {
        this.ldshyj = ldshyj;
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

    public String getLy() {
        return ly;
    }

    public void setLy(String ly) {
        this.ly = ly;
    }

    public Long getLyid() {
        return lyid;
    }

    public void setLyid(Long lyid) {
        this.lyid = lyid;
    }

    public String getYhlb() {
        return yhlb;
    }

    public void setYhlb(String yhlb) {
        this.yhlb = yhlb;
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
}