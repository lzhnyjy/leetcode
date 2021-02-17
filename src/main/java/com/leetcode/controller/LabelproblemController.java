package com.leetcode.controller;

import com.leetcode.entity.Labelproblem;
import com.leetcode.service.LabelproblemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Labelproblem)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:14:01
 */
@RestController
@RequestMapping("labelproblem")
public class LabelproblemController {
    /**
     * 服务对象
     */
    @Resource
    private LabelproblemService labelproblemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Labelproblem selectOne(Integer id) {
        return this.labelproblemService.queryById(id);
    }

}
