package com.leetcode.controller;

import com.leetcode.entity.Solutionimage;
import com.leetcode.service.SolutionimageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Solutionimage)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:11:33
 */
@RestController
@RequestMapping("solutionimage")
public class SolutionimageController {
    /**
     * 服务对象
     */
    @Resource
    private SolutionimageService solutionimageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Solutionimage selectOne(Integer id) {
        return this.solutionimageService.queryById(id);
    }

}
