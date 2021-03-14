package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * system_dictionary
 * @author 
 */

public class SystemDictionary implements Serializable {
    private Integer id;

    /**
     * 类别id
     */
    private Integer pid;

    /**
     * 字典类别代码
     */
    private String dictcode;

    /**
     * 字典名称
     */
    private String dictname;

    /**
     * 项名称
     */
    private String dictdataname;

    /**
     * 项值
     */
    private String dictdatavalue;

    /**
     * 描述
     */
    private String comments;

    private Integer sortnumber;

    /**
     * 创建时间
     */
    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getDictcode() {
        return dictcode;
    }

    public void setDictcode(String dictcode) {
        this.dictcode = dictcode;
    }

    public String getDictname() {
        return dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname;
    }

    public String getDictdataname() {
        return dictdataname;
    }

    public void setDictdataname(String dictdataname) {
        this.dictdataname = dictdataname;
    }

    public String getDictdatavalue() {
        return dictdatavalue;
    }

    public void setDictdatavalue(String dictdatavalue) {
        this.dictdatavalue = dictdatavalue;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getSortnumber() {
        return sortnumber;
    }

    public void setSortnumber(Integer sortnumber) {
        this.sortnumber = sortnumber;
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