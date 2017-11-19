package com.ddshidai.dao;

import com.ddshidai.model.User_label;

public interface User_labelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_label record);

    int insertSelective(User_label record);

    User_label selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_label record);

    int updateByPrimaryKey(User_label record);
}