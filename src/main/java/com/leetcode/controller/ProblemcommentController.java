package com.leetcode.controller;

import com.leetcode.entity.Problemcomment;
import com.leetcode.entity.dto.ProblemCommentDTO;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.response.PageResult;
import com.leetcode.service.ProblemcommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Problemcomment)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:13:00
 */
@RestController
@RequestMapping("problemcomment")
public class ProblemcommentController {
    /**
     * 服务对象
     */
    @Resource
    private ProblemcommentService problemcommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Problemcomment selectOne(Integer id) {
        return this.problemcommentService.queryById(id);
    }


    @PostMapping("")
    public RestInfo comment(@RequestBody ProblemCommentDTO dto) {
        Problemcomment problemcomment = new Problemcomment();
        BeanUtils.copyProperties(dto, problemcomment);
        problemcommentService.insert(problemcomment);
        return new RestInfo();
    }

    @GetMapping("/{problemId}/{sortedClass}")
    public RestInfo page(@RequestParam(defaultValue = "1", required = false) Integer pages,
                         @RequestParam(defaultValue = "10", required = false) Integer limit,
                         @PathVariable Integer problemId,
                         @PathVariable Integer sortedClass) {
        PageResult pageResult = problemcommentService.listCommentsByPage(problemId, sortedClass, limit, pages);
        return new RestInfo(pageResult);
    }

    @PostMapping("/comment/like")
    public void addLike(){

    }
}
