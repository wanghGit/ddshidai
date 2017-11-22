package com.ddshidai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddshidai.dao.UserMapper;
import com.ddshidai.model.User;

/**
 * @author wangheng
 */
public interface UserService {

    public User selectByPrimaryKey(int id);

    public Object queryAll(int id);

    public User login(String phone, String password);

    public int register(User user);

    public int updateByPrimaryKeySelective(User user);
}
