package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * edu_studyinfo
 * @author 
 */

public class EduStudyinfo implements Serializable {
    private Long id;

    /**
     * 题库ID
     */
    private Long tkid;

    /**
     * 学习人
     */
    private String xm;

    /**
     * 科目名称
     */
    private String kmmc;

    /**
     * 学习时间
     */
    private String xxsj;

    /**
     * 试题类别
     */
    private String stlx;

    /**
     * 试题内容
     */
    private String stnr;

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

    public Long getTkid() {
        return tkid;
    }

    public void setTkid(Long tkid) {
        this.tkid = tkid;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getKmmc() {
        return kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
    }

    public String getXxsj() {
        return xxsj;
    }

    public void setXxsj(String xxsj) {
        this.xxsj = xxsj;
    }

    public String getStlx() {
        return stlx;
    }

    public void setStlx(String stlx) {
        this.stlx = stlx;
    }

    public String getStnr() {
        return stnr;
    }

    public void setStnr(String stnr) {
        this.stnr = stnr;
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