package com.ddshidai.dao;

import com.ddshidai.model.User_user;

public interface User_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_user record);

    int insertSelective(User_user record);

    User_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_user record);

    int updateByPrimaryKey(User_user record);
}