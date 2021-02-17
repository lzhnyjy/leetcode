package com.leetcode.controller;

import com.leetcode.entity.User;
import com.leetcode.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:09:19
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public User selectOne(@Param("id") Integer id) {
        return this.userService.queryById(id);
    }
    @GetMapping("select")
    public User selectOne() {
        System.out.println("....");
        return this.userService.queryById(1);
    }

}
