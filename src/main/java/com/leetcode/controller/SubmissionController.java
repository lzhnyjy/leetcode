package com.leetcode.controller;

import com.leetcode.annotation.UserLoginToken;
import com.leetcode.entity.dto.SubmitMessageDto;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.exception.CompileFileException;
import com.leetcode.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/leetcode/question")
public class SubmissionController {

    @Autowired
    SubmissionService submissionService;

    /**
     * 查询提交记录
     * @param userId
     * @param problemId
     * @return
     */
    @UserLoginToken
    @GetMapping(value = "/{problemId}/submissions")
    public RestInfo querySubmissionsById(@RequestParam("userId") Integer userId, @PathVariable("problemId") int problemId){
       return submissionService.querySubmissionsById(userId, problemId);
    }

    /**
     * 提交代码
     * @return
     */
    @UserLoginToken
    @PostMapping(value = "/{problemId}/submissions/submit")
    public RestInfo submitCode(@RequestBody SubmitMessageDto submitMessageDto) throws CompileFileException {
        return submissionService.compileCode(submitMessageDto);

    }
}
