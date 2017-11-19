package com.ddshidai.dao;

import com.ddshidai.model.Problem_free_image;

public interface Problem_free_imageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem_free_image record);

    int insertSelective(Problem_free_image record);

    Problem_free_image selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem_free_image record);

    int updateByPrimaryKey(Problem_free_image record);
}