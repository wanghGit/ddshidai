package com.ddshidai.dao;

import com.ddshidai.model.Problem_free_label;

public interface Problem_free_labelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem_free_label record);

    int insertSelective(Problem_free_label record);

    Problem_free_label selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem_free_label record);

    int updateByPrimaryKey(Problem_free_label record);
}