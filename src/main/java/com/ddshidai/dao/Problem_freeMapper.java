package com.ddshidai.dao;

import com.ddshidai.model.Problem_free;

import java.util.List;

public interface Problem_freeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem_free record);

    int insertSelective(Problem_free record);

    Problem_free selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem_free record);

    int updateByPrimaryKeyWithBLOBs(Problem_free record);

    int updateByPrimaryKey(Problem_free record);

    List<Problem_free> getAllProblem();
}