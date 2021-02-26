package com.leetcode.controller;/**
 * @Author lzh
 */

import com.leetcode.entity.Solution;
import com.leetcode.response.Result;
import com.leetcode.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/20 21:14
 * @Version 1.0
 */
@RestController()
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public Result test(){
        Solution test = testService.test();
        return new Result(true,200,"查询成功",test);
    }
}
