package com.ddshidai.dao;

import com.ddshidai.model.User_problem;

public interface User_problemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_problem record);

    int insertSelective(User_problem record);

    User_problem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_problem record);

    int updateByPrimaryKey(User_problem record);
}