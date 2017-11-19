package com.ddshidai.dao;

import com.ddshidai.model.Problem_free_support;

public interface Problem_free_supportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem_free_support record);

    int insertSelective(Problem_free_support record);

    Problem_free_support selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem_free_support record);

    int updateByPrimaryKey(Problem_free_support record);
}