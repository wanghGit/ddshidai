package com.ddshidai.controller;

import com.ddshidai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by lenovo on 2017/3/12.
 */
@RestController
@RequestMapping(value = "/find")
public class RealDealController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/user")
    public
    @ResponseBody
    Object findUser(@RequestParam Map map) {
    	String id = "";
    	System.out.println(map.get("id")+"//////");
    	if(map.get("id").equals("1")) {
    		id="2";
    	}else{
    		id="1";
    	}
        return userService.selectByPrimaryKey(Integer.parseInt(id));
    }
}
