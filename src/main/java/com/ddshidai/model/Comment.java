package com.ddshidai.model;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer problemFreeId;

    private Integer userId;

    private Integer readNum;

    private Date createTime;

    private byte[] content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProblemFreeId() {
        return problemFreeId;
    }

    public void setProblemFreeId(Integer problemFreeId) {
        this.problemFreeId = problemFreeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}