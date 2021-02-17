package com.leetcode.controller;

import com.leetcode.entity.Problem;
import com.leetcode.service.ProblemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Problem)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:13:30
 */
@RestController
@RequestMapping("problem")
public class ProblemController {
    /**
     * 服务对象
     */
    @Resource
    private ProblemService problemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Problem selectOne(Integer id) {
        return this.problemService.queryById(id);
    }

}
