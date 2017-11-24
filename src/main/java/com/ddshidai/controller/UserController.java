package com.ddshidai.controller;

import com.ddshidai.model.User;
import com.ddshidai.service.UserService;
import com.ddshidai.utils.ToMd5;
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
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public
    @ResponseBody
    Object login(@RequestParam Map map) {
        return userService.login(map.get("phone").toString(), ToMd5.md5Password(map.get("password").toString()));
    }

    @RequestMapping(value = "/register")
    public
    @ResponseBody
    Object register(@RequestParam Map map) {
        User user = new User();
        user.setPhone(map.get("phone").toString());
        user.setPassword(ToMd5.md5Password(map.get("password").toString()));

        return userService.register(user);
    }

    @RequestMapping(value = "/updateUserNameAndRole")
    public
    @ResponseBody
    Object updateUserNameAndRole(@RequestParam Map map) {
        int id = Integer.parseInt(map.get("id").toString());
        String name = map.get("name").toString();
        String role = map.get("role").toString();

        User user = userService.selectByPrimaryKey(id);
        user.setName(name);
        user.setRole(role);

        return userService.updateByPrimaryKeySelective(user);
    }

    @RequestMapping(value = "/updateUserPhoneAndEmail")
    public
    @ResponseBody
    Object updateUserPhoneAndEmail(@RequestParam Map map) {
        int id = Integer.parseInt(map.get("id").toString());
        String phone = map.get("phone").toString();
        String email = map.get("email").toString();

        User user = userService.selectByPrimaryKey(id);
        user.setPhone(phone);
        user.setEmail(email);

        return userService.updateByPrimaryKeySelective(user);
    }

    @RequestMapping(value = "/getRecommendedUser")
    public
    @ResponseBody
    Object getRecommendedUser(@RequestParam Map map) {

        List<User> userList = userService.getRecommendedUser();

        return userList;
    }
}
