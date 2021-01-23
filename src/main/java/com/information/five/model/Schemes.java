package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * schemes
 * @author 
 */

public class Schemes implements Serializable {
    private Long id;

    /**
     * 试卷方案ID
     */
    private Long sjmcid;

    /**
     * 题型
     */
    private String tx;

    /**
     * 章节名称
     */
    private String zjmc;

    /**
     * 总数
     */
    private Integer num;

    /**
     * 抽取数量
     */
    private Integer selnum;

    /**
     * 分值
     */
    private Integer dvalue;

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

    public Long getSjmcid() {
        return sjmcid;
    }

    public void setSjmcid(Long sjmcid) {
        this.sjmcid = sjmcid;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getZjmc() {
        return zjmc;
    }

    public void setZjmc(String zjmc) {
        this.zjmc = zjmc;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSelnum() {
        return selnum;
    }

    public void setSelnum(Integer selnum) {
        this.selnum = selnum;
    }

    public Integer getDvalue() {
        return dvalue;
    }

    public void setDvalue(Integer dvalue) {
        this.dvalue = dvalue;
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