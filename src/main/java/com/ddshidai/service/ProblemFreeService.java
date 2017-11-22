package com.ddshidai.service;

import com.ddshidai.dao.Problem_freeMapper;
import com.ddshidai.dao.Problem_typeMapper;
import com.ddshidai.model.Problem_free;
import com.ddshidai.model.Problem_type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuqinghua on 2017/11/20.
 */
@Service
public class ProblemFreeService {
    @Autowired
    Problem_freeMapper problem_freeMapper;

    public int insertSelective(Problem_free problem_free) {
        return problem_freeMapper.insertSelective(problem_free);
    }

    public List<Problem_free> getAllProblem() {
        return problem_freeMapper.getAllProblem();
    }
}
