package com.ddshidai.model;

import java.util.Date;

public class User_problem {
    private Integer id;

    private Integer problemFreeId;

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