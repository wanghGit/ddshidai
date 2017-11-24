package com.ddshidai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddshidai.dao.UserMapper;
import com.ddshidai.model.User;

import java.util.List;

/**
 * @author wangheng
 */

public interface UserService {

    User selectByPrimaryKey(int id);

    Object queryAll(int id);

    User login(String phone, String password);

    int register(User user);

    int updateByPrimaryKeySelective(User user);

    List<User> getRecommendedUser();
}
