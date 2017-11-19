package com.ddshidai.dao;

import com.ddshidai.model.Problem_pay_label;

public interface Problem_pay_labelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem_pay_label record);

    int insertSelective(Problem_pay_label record);

    Problem_pay_label selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem_pay_label record);

    int updateByPrimaryKey(Problem_pay_label record);
}