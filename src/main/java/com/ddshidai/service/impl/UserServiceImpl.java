package com.ddshidai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddshidai.dao.UserMapper;
import com.ddshidai.model.User;
import com.ddshidai.service.UserService;

/**
 * @author wangheng
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User selectByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public Object queryAll(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public User login(String phone, String password) {
        return userMapper.login(phone, password);
    }

    public int register(User user) {
        return userMapper.insertSelective(user);
    }

    public int updateByPrimaryKeySelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
