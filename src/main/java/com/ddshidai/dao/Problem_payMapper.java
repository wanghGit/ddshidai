package com.ddshidai.dao;

import com.ddshidai.model.Problem_pay;

public interface Problem_payMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem_pay record);

    int insertSelective(Problem_pay record);

    Problem_pay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem_pay record);

    int updateByPrimaryKey(Problem_pay record);
}