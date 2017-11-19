package com.ddshidai.dao;

import com.ddshidai.model.Comment_child_support;

public interface Comment_child_supportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment_child_support record);

    int insertSelective(Comment_child_support record);

    Comment_child_support selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment_child_support record);

    int updateByPrimaryKey(Comment_child_support record);
}