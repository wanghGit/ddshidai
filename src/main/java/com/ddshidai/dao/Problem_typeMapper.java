package com.ddshidai.dao;

import com.ddshidai.model.Problem_type;

public interface Problem_typeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem_type record);

    int insertSelective(Problem_type record);

    Problem_type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem_type record);

    int updateByPrimaryKey(Problem_type record);
}