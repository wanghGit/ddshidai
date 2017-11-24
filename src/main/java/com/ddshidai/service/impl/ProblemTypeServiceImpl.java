package com.ddshidai.service.impl;

import com.ddshidai.dao.Problem_typeMapper;
import com.ddshidai.model.Problem_type;
import com.ddshidai.service.ProblemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuqinghua on 2017/11/20.
 */
@Service
public class ProblemTypeServiceImpl implements ProblemTypeService{
    @Autowired
    Problem_typeMapper problem_typeMapper;

    public List<Problem_type> getAllProblemType() {
        return problem_typeMapper.getAllProblemType();
    }
}
