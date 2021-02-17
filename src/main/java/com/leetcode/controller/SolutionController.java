package com.leetcode.controller;

import com.leetcode.entity.Solution;
import com.leetcode.service.SolutionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Solution)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:12:36
 */
@RestController
@RequestMapping("solution")
public class SolutionController {
    /**
     * 服务对象
     */
    @Resource
    private SolutionService solutionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Solution selectOne(Integer id) {
        return this.solutionService.queryById(id);
    }

}
