package com.zxq.pojo;

import java.util.Date;

/**
    * 用户表
    */
public class User {
    /**
    * ID
    */
    private Long id;

    /**
    * 角色ID
    */
    private Long username;

    /**
    * URL资源ID
    */
    private Long password;

    /**
    * 删除标记:0未删除，1删除
    */
    private Boolean isDelete;

    /**
    * 创建日期
    */
    private Date createTime;

    /**
    * 创建用户
    */
    private String createUser;

    /**
    * 修改日期
    */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}