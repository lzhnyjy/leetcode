package com.leetcode.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leetcode.entity.Label;
import lombok.extern.slf4j.Slf4j;
import com.leetcode.response.Result;
import com.leetcode.entity.Solution;
import com.leetcode.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * (Solution)控制层
 *
 * @author protagonist
 * @since 2021-02-18 20:11:24
 */
@RestController
@Slf4j
@RequestMapping("question/solution")
public class SolutionController {

    @Autowired
    private SolutionService solutionService;

    /*@Autowired
    private UserService userService;*/



    /**
     * @return com.leetcode.response.Result
     * @Author lzh
     * @Description //TODO 搜索题解/题解排序/翻页
     * @Date 20:23 2021/2/18
     * @Param [problemId, solutionKey, page, solutionOrderType, solutionType]
     **/
    @GetMapping(value = "/{problemId}/{solutionKey}/{page}/{solutionOrderType}/{solutionType}")
    public Result solution(@PathVariable("problemId") Integer problemId, @PathVariable("solutionKey") String solutionKey, @PathVariable("page") Integer page,
                           @PathVariable("solutionOrderType") Integer solutionOrderType, @PathVariable("solutionType") String solutionType) {
        log.info("problemId===>{}", problemId);
        log.info("solutionKey===>{}", solutionKey);
        log.info("page===>{}", page);
        log.info("solutionOrderType===>{}", solutionOrderType);
        log.info("solutionType===>{}", solutionType);

        PageHelper.startPage(page,10);
        List<Solution> solution = solutionService.solution(problemId, solutionKey, solutionOrderType, solutionType);
        PageInfo<Solution> pageInfo=new PageInfo<>(solution);
        Map<String,Object> map=new HashMap<>();
        map.put("solution", solution);
        map.put("totalPage",pageInfo.getPages());
        return new Result(true,200,"查询成功",map);
    }

    /**
     * @Author lzh
     * @Description //TODO 查看题目标签
     * @Date 23:32 2021/2/23
     * @Param [solutionId]
     * @return com.leetcode.response.Result
     **/
    @GetMapping("/label/{solutionId}")
    public Result selectLabel(@PathVariable("solutionId") Integer solutionId) {
        List<Label> labels = solutionService.selectLabel(solutionId);
        solutionService.addSolutionVisitedNumber(solutionId);
        return new Result(true, 200, "查询成功", labels);
    }

        /**
         * @Author lzh
         * @Description //TODO 查看题解
         * @Date 21:49 2021/2/18
         * @Param [solutionId]
         * @return com.leetcode.entity.Solution
         **/
    @GetMapping(value = "/{solutionId}")
    public Result selectSolutionById(@PathVariable("solutionId") Integer solutionId) {
        solutionService.addSolutionVisitedNumber(solutionId);
        Solution solution = solutionService.selectSolutionById(solutionId);
        return new Result(true, 200, "题解查询成功",solution);
    }

    /**
     * @Author lzh
     * @Description //TODO 点赞 or 取消赞
     * @Date 14:19 2021/2/24
     * @Param [type, targetType, solutionId]
     * @return com.leetcode.response.Result
     **/
    @PutMapping("/like/{userId}/{targetType}/{type}/{solutionId}")
    public Result addSolutionLikeNumber(@PathVariable("type") Integer type,@PathVariable("targetType") Integer targetType,@PathVariable("solutionId") Integer solutionId,@PathVariable("userId") Integer userId){
        Integer likeNumber = solutionService.addSolutionLikeNumber(type,targetType,solutionId,userId);
        if(type==1)
        return new Result(true, 200, "点赞成功", likeNumber);
        return new Result(true, 200, "取消赞成功", likeNumber);
    }

    @PostMapping("/")
    public Result addSolution(@RequestBody Solution solution){
        solutionService.addSolution(solution);
        solutionService.addSolutionLabel(solution);
        solution = solutionService.selectSolutionById(solution.getSolutionId());
        return new Result(true, 200, "题解提交成功",solution);
    }
}
