package com.leetcode.controller;

import com.leetcode.entity.Label;
import com.leetcode.service.LabelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Label)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:14:11
 */
@RestController
@RequestMapping("label")
public class LabelController {
    /**
     * 服务对象
     */
    @Resource
    private LabelService labelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Label selectOne(Integer id) {
        return this.labelService.queryById(id);
    }

}
