package com.ddshidai.dao;

import com.ddshidai.model.Comment_child;

public interface Comment_childMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment_child record);

    int insertSelective(Comment_child record);

    Comment_child selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment_child record);

    int updateByPrimaryKeyWithBLOBs(Comment_child record);

    int updateByPrimaryKey(Comment_child record);
}