package com.leetcode.controller;

import com.leetcode.entity.Problemcomment;
import com.leetcode.service.ProblemcommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Problemcomment)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:13:00
 */
@RestController
@RequestMapping("problemcomment")
public class ProblemcommentController {
    /**
     * 服务对象
     */
    @Resource
    private ProblemcommentService problemcommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Problemcomment selectOne(Integer id) {
        return this.problemcommentService.queryById(id);
    }

}
