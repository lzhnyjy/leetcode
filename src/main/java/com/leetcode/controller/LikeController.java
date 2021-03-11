package com.leetcode.controller;

import com.leetcode.annotation.UserLoginToken;
import com.leetcode.entity.dto.ProblemLikeDto;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leetcode/question")
public class LikeController {

    @Autowired
    LikeService likeService;

    /**
     * 查询题目的点赞状态
     * @param problemId
     * @return
     */
    @UserLoginToken
    @GetMapping(value = "/{problemId}/queryLikeStatus")
    public RestInfo queryLikeStatus(@PathVariable int problemId, @RequestParam("userId") Integer userId) {
        String likeStatus = likeService.queryLikeStatus(problemId, userId);
        return RestInfo.success("点赞状态查询", likeStatus);
    }


    /**
     * 改变题目的点赞状态
     * @param problemId
     * @param problemLikeDto
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/{problemId}/likes")
    public RestInfo changeLikeStatus(@PathVariable int problemId, @RequestBody ProblemLikeDto problemLikeDto) {
        return likeService.changeLikeStatus(problemId, problemLikeDto.getUserId());
    }
}
