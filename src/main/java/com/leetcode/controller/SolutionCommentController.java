package com.leetcode.controller;/**
 * @Author lzh
 */

import com.leetcode.entity.SolutionComment;
import com.leetcode.response.Result;
import com.leetcode.service.SolutionCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName SolutionCommentController
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/24 12:10
 * @Version 1.0
 */
@RestController
@RequestMapping("question/solutionComment")
public class SolutionCommentController {

    @Autowired
    private SolutionCommentService solutionCommentService;

    @GetMapping("/{solutionId}")
    public Result selectCommentBySolutionId(@PathVariable("solutionId") Integer solutionId){
        List<SolutionComment> solutionComments = solutionCommentService.selectCommentBySolutionId(solutionId);
        return new Result(true, 200, "评论查询成功", solutionComments);
    }

    @PostMapping("/")
    public Result addSolutionComment(@RequestBody SolutionComment solutionComment){
        SolutionComment comment=null;
        solutionCommentService.addSolutionComment(solutionComment);
        if(solutionComment.getParentId()==null){
            comment = solutionCommentService.selectOneComment(solutionComment.getSolutionId(), solutionComment.getCommentId());
        }else{
            Integer topMostCommentId=solutionCommentService.selectTopMostCommentId(solutionComment.getParentId());
            comment = solutionCommentService.selectOneComment(solutionComment.getSolutionId(),topMostCommentId);
        }
        return new Result(true, 200, "评论成功", comment);
    }



}
