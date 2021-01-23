package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * score
 * @author 
 */

public class Score implements Serializable {
    private Long id;

    /**
     * 学号
     */
    private String xh;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 性别
     */
    private String xb;

    /**
     * 班级
     */
    private String bj;

    /**
     * 学院
     */
    private String xy;

    /**
     * 科目名称
     */
    private String kmmc;

    /**
     * 考场密码
     */
    private String kcmm;

    /**
     * 开始时间
     */
    private String sttime;

    /**
     * 结束时间
     */
    private String ettime;

    /**
     * 创建年份
     */
    private String cjnf;

    /**
     * 单选
     */
    private Integer sint;

    /**
     * 多选
     */
    private Integer mult;

    /**
     * 判断
     */
    private Integer jugt;

    /**
     * 填空
     */
    private Integer blnt;

    /**
     * 总分
     */
    private Integer total;

    /**
     * 试卷方案ID
     */
    private Integer sjmcid;

    /**
     * 场次ID
     */
    private Integer ccid;

    /**
     * 考试状态
     */
    private Integer yesno;

    /**
     * 试卷
     */
    private String examPaper;

    /**
     * 随机试卷组合
     */
    private String randst;

    /**
     * 随机试卷ID
     */
    private String sjguid;

    /**
     * 是否批改
     */
    private Integer issubmited;

    /**
     * 答案
     */
    private String answer;

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

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy;
    }

    public String getKmmc() {
        return kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
    }

    public String getKcmm() {
        return kcmm;
    }

    public void setKcmm(String kcmm) {
        this.kcmm = kcmm;
    }

    public String getSttime() {
        return sttime;
    }

    public void setSttime(String sttime) {
        this.sttime = sttime;
    }

    public String getEttime() {
        return ettime;
    }

    public void setEttime(String ettime) {
        this.ettime = ettime;
    }

    public String getCjnf() {
        return cjnf;
    }

    public void setCjnf(String cjnf) {
        this.cjnf = cjnf;
    }

    public Integer getSint() {
        return sint;
    }

    public void setSint(Integer sint) {
        this.sint = sint;
    }

    public Integer getMult() {
        return mult;
    }

    public void setMult(Integer mult) {
        this.mult = mult;
    }

    public Integer getJugt() {
        return jugt;
    }

    public void setJugt(Integer jugt) {
        this.jugt = jugt;
    }

    public Integer getBlnt() {
        return blnt;
    }

    public void setBlnt(Integer blnt) {
        this.blnt = blnt;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSjmcid() {
        return sjmcid;
    }

    public void setSjmcid(Integer sjmcid) {
        this.sjmcid = sjmcid;
    }

    public Integer getCcid() {
        return ccid;
    }

    public void setCcid(Integer ccid) {
        this.ccid = ccid;
    }

    public Integer getYesno() {
        return yesno;
    }

    public void setYesno(Integer yesno) {
        this.yesno = yesno;
    }

    public String getExamPaper() {
        return examPaper;
    }

    public void setExamPaper(String examPaper) {
        this.examPaper = examPaper;
    }

    public String getRandst() {
        return randst;
    }

    public void setRandst(String randst) {
        this.randst = randst;
    }

    public String getSjguid() {
        return sjguid;
    }

    public void setSjguid(String sjguid) {
        this.sjguid = sjguid;
    }

    public Integer getIssubmited() {
        return issubmited;
    }

    public void setIssubmited(Integer issubmited) {
        this.issubmited = issubmited;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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