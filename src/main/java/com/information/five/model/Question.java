package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * question
 * @author 
 */

public class Question implements Serializable {
    private Long id;

    /**
     * 科目名称
     */
    private String kmmc;

    /**
     * 章节名称
     */
    private String zjmc;

    /**
     * 题型
     */
    private String tx;

    /**
     * 难易度
     */
    private String nyd;

    private String content;

    /**
     * 选项A
     */
    private String sela;

    /**
     * 选项B
     */
    private String selb;

    /**
     * 选项C
     */
    private String selc;

    /**
     * 选项D
     */
    private String seld;

    private String answer;

    /**
     * 出题人
     */
    private String ctr;

    /**
     * 创建时间
     */
    private Date createdAt;

    private Date updatedAt;

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKmmc() {
        return kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
    }

    public String getZjmc() {
        return zjmc;
    }

    public void setZjmc(String zjmc) {
        this.zjmc = zjmc;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getNyd() {
        return nyd;
    }

    public void setNyd(String nyd) {
        this.nyd = nyd;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSela() {
        return sela;
    }

    public void setSela(String sela) {
        this.sela = sela;
    }

    public String getSelb() {
        return selb;
    }

    public void setSelb(String selb) {
        this.selb = selb;
    }

    public String getSelc() {
        return selc;
    }

    public void setSelc(String selc) {
        this.selc = selc;
    }

    public String getSeld() {
        return seld;
    }

    public void setSeld(String seld) {
        this.seld = seld;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
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