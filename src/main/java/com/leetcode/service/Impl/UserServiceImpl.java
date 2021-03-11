
package com.leetcode.service.impl;/**
 * @Author lzh
 */

import com.leetcode.entity.User;
import com.leetcode.mapper.UserDao;
import com.leetcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/19 15:12
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User selectImageById(Integer userId) {
        User user = userDao.selectImageById(userId);
        return user;
    }
}
