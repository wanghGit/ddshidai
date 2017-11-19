package com.ddshidai.dao;

import com.ddshidai.model.Support_user;

public interface Support_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Support_user record);

    int insertSelective(Support_user record);

    Support_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Support_user record);

    int updateByPrimaryKey(Support_user record);
}