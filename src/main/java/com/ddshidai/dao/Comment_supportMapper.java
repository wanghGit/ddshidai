package com.ddshidai.dao;

import com.ddshidai.model.Comment_support;

public interface Comment_supportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment_support record);

    int insertSelective(Comment_support record);

    Comment_support selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment_support record);

    int updateByPrimaryKey(Comment_support record);
}