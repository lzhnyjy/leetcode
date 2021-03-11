package com.leetcode.controller;

import com.leetcode.entity.User;
import com.leetcode.response.Result;
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

    /*
     * @Author lzh
     * @Description //TODO 根据 id 查询 头像
     * @Date 23:11 2021/2/23
     * @Param [userId]
     * @return com.leetcode.response.Result
     **/
    @RequestMapping("/{userId}")
    public Result selectImageById(@PathVariable("userId") Integer userId) {
        User user = userService.selectImageById(userId);
        return new Result(true, 200, "用户查询成功", user);
    }

}
