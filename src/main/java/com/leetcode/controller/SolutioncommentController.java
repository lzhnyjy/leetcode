package com.leetcode.controller;

import com.leetcode.entity.Solutioncomment;
import com.leetcode.service.SolutioncommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Solutioncomment)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:11:44
 */
@RestController
@RequestMapping("solutioncomment")
public class SolutioncommentController {
    /**
     * 服务对象
     */
    @Resource
    private SolutioncommentService solutioncommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Solutioncomment selectOne(Integer id) {
        return this.solutioncommentService.queryById(id);
    }

}
