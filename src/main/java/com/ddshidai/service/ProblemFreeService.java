package com.ddshidai.service;

import com.ddshidai.model.Problem_free;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuqinghua on 2017/11/20.
 */
@Service
public interface ProblemFreeService {

    int insertSelective(Problem_free problem_free);

    List<Problem_free> getAllProblem();
}
