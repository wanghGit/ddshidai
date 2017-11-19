package com.ddshidai.model;

import java.util.Date;

public class Problem_free {
    private Integer id;

    private Integer probelmTypeId;

    private Date createTime;

    private byte[] content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProbelmTypeId() {
        return probelmTypeId;
    }

    public void setProbelmTypeId(Integer probelmTypeId) {
        this.probelmTypeId = probelmTypeId;
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