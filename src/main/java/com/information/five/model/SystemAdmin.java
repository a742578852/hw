package com.information.five.model;

import java.io.Serializable;
import java.util.Date;


/**
 * system_admin
 * @author 
 */

public class SystemAdmin implements Serializable {
    private Long id;

    /**
     * 人员ID
     */
    private Integer ryid;

    /**
     * 账号
     */
    private String username;

    private String password;

    /**
     * 昵称
     */
    private String nick;

    private String sessionToken;

    /**
     * 状态1正常0锁定
     */
    private Boolean status;

    private Boolean issuper;

    /**
     * 最近一次登录的ip
     */
    private String lastLoginIp;

    /**
     * 最近一次登录的时间
     */
    private Date lastLoginTime;

    private String apiToken;

    private Integer hits;

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

    public Integer getRyid() {
        return ryid;
    }

    public void setRyid(Integer ryid) {
        this.ryid = ryid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIssuper() {
        return issuper;
    }

    public void setIssuper(Boolean issuper) {
        this.issuper = issuper;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
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