package com.leetcode.service;

import com.leetcode.mapper.UserMapper;
import com.leetcode.vo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getByPhone(String phone) {
        return userMapper.getByPhone(phone);
    }

    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }

    public User getByEmail(String email) {
        return userMapper.getByEmail(email);
    }

    public void add(User user) {
        userMapper.add(user);
    }

}
