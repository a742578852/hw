package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * subject
 * @author 
 */

public class Subject implements Serializable {
    private Long id;

    /**
     * 科目名称
     */
    private String kmmc;

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

    public String getKmmc() {
        return kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
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