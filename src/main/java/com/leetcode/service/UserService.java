package com.leetcode.service;

import com.leetcode.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:09:18
 */
public interface UserService {

    public User selectImageById(Integer userId);
}
