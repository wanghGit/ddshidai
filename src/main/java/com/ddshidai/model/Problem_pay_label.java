package com.ddshidai.model;

import java.util.Date;

public class Problem_pay_label {
    private Integer id;

    private Integer problemPayId;

    private Integer labelId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProblemPayId() {
        return problemPayId;
    }

    public void setProblemPayId(Integer problemPayId) {
        this.problemPayId = problemPayId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}