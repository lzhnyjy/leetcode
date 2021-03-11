package com.leetcode.controller;

import com.leetcode.entity.Labelsolution;
import com.leetcode.service.LabelsolutionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Labelsolution)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:13:50
 */
@RestController
@RequestMapping("labelsolution")
public class LabelsolutionController {
    /**
     * 服务对象
     */
    @Resource
    private LabelsolutionService labelsolutionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Labelsolution selectOne(Integer id) {
        return this.labelsolutionService.queryById(id);
    }

}
