package com.leetcode.controller;

import com.leetcode.service.ExampleinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Exampleinfo)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:14:22
 */
@RestController
@RequestMapping("exampleinfo")
public class ExampleinfoController {
    /**
     * 服务对象
     */
    @Resource
    private ExampleinfoService exampleinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Exampleinfo selectOne(Integer id) {
        return this.exampleinfoService.queryById(id);
    }

}
