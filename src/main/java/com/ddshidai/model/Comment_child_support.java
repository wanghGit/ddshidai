package com.ddshidai.model;

import java.util.Date;

public class Comment_child_support {
    private Integer id;

    private Integer commentChildId;

    private Integer userId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentChildId() {
        return commentChildId;
    }

    public void setCommentChildId(Integer commentChildId) {
        this.commentChildId = commentChildId;
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