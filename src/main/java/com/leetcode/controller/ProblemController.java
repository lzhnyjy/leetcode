package com.leetcode.controller;

import com.leetcode.annotation.PassToken;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leetcode/question")
public class ProblemController {

    @Autowired
    ProblemService problemService;

    /**
     * 查询题目的详细内容
     * @param problemId
     * @param userId
     * @return
     */
    @PassToken
    @GetMapping(value = "/{problemId}/")
    public RestInfo queryProblemById(@PathVariable("problemId") int problemId, @RequestParam("userId") Integer userId) {
        return problemService.queryProblemById(problemId,userId);

    }

}
