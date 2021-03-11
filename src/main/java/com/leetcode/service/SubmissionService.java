package com.leetcode.service;


import com.leetcode.entity.dto.SubmitMessageDto;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.exception.CompileFileException;


public interface SubmissionService {

    //根据userId查询用户的提交信息
    RestInfo querySubmissionsById(Integer userId, int problemId);

    //编译用户发来的代码
    RestInfo compileCode(SubmitMessageDto submitMessageDto) throws CompileFileException;



}
