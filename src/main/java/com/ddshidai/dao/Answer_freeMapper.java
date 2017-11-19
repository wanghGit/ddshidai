package com.ddshidai.dao;

import com.ddshidai.model.Answer_free;

public interface Answer_freeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Answer_free record);

    int insertSelective(Answer_free record);

    Answer_free selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Answer_free record);

    int updateByPrimaryKeyWithBLOBs(Answer_free record);

    int updateByPrimaryKey(Answer_free record);
}