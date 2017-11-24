package com.ddshidai.controller;

import com.ddshidai.model.Problem_free;
import com.ddshidai.model.Problem_type;
import com.ddshidai.service.ProblemFreeService;
import com.ddshidai.service.ProblemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/3/12.
 */
@RestController
@RequestMapping(value = "/problem")
public class ProblemController {

    @Autowired
    ProblemTypeService problemTypeService;
    @Autowired
    ProblemFreeService problemFreeService;

    @RequestMapping(value = "/getAllProblemType")
    public
    @ResponseBody
    Object getAllProblemType(@RequestParam Map map) {
        List<Problem_type> problem_typeList = problemTypeService.getAllProblemType();
        return problem_typeList;
    }

    @RequestMapping(value = "/insert")
    public
    @ResponseBody
    Object insert(@RequestParam Map map) {
        int type = Integer.parseInt(map.get("type").toString());
        int userID = Integer.parseInt(map.get("userID").toString());
        String title = map.get("title").toString();
        String content = map.get("content").toString();

        Problem_free problem_free = new Problem_free();

        problem_free.setProbelmTypeId(type);
        problem_free.setUserId(userID);
        problem_free.setTitle(title);
        problem_free.setContent(content);
        return problemFreeService.insertSelective(problem_free);
    }

    @RequestMapping(value = "/getAllProblem")
    public
    @ResponseBody
    Object getAllProblem(@RequestParam Map map) {
        return problemFreeService.getAllProblem();
    }


}
