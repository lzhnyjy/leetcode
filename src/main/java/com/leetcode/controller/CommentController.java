package com.leetcode.controller;

import com.leetcode.annotation.PassToken;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leetcode/question")
public class CommentController {

    @Autowired
    CommentService commentService;

    /**
     * 展示评论
     * @param problemId
     * @param page
     * @param limit
     * @return
     */
    @PassToken
    @GetMapping(value = "/{problemId}/comments")
    public RestInfo queryProblemComments(@PathVariable("problemId") int problemId,
                                         @RequestParam(name = "page", defaultValue = "1") int page,
                                         @RequestParam(name = "limit", required = false, defaultValue = "14") int limit) {
        return commentService.queryProblemComments(problemId, page, limit);
    }

}
