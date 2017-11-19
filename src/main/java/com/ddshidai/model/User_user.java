package com.ddshidai.model;

import java.util.Date;

public class User_user {
    private Integer id;

    private Integer followedUserIid;

    private Integer userId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowedUserIid() {
        return followedUserIid;
    }

    public void setFollowedUserIid(Integer followedUserIid) {
        this.followedUserIid = followedUserIid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}