package com.leetcode.controller;

import com.leetcode.entity.Problemdesc;
import com.leetcode.service.ProblemdescService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Problemdesc)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:12:47
 */
@RestController
@RequestMapping("problemdesc")
public class ProblemdescController {
    /**
     * 服务对象
     */
    @Resource
    private ProblemdescService problemdescService;

  /*  *//**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     *//*
    @GetMapping("selectOne")
    public Problemdesc selectOne(id) {
        return this.problemdescService.queryById(id);
    }*/

}
