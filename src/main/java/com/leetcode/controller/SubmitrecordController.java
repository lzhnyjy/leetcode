package com.leetcode.controller;

import com.leetcode.entity.Submitrecord;
import com.leetcode.service.SubmitrecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Submitrecord)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:11:20
 */
@RestController
@RequestMapping("submitrecord")
public class SubmitrecordController {
    /**
     * 服务对象
     */
    @Resource
    private SubmitrecordService submitrecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Submitrecord selectOne(Integer id) {
        return this.submitrecordService.queryById(id);
    }

}
