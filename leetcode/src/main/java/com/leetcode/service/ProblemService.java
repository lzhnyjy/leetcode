package com.leetcode.service;

import com.leetcode.entity.Problem;
import com.leetcode.entity.Problemdesc;
import com.leetcode.entity.UserPerformance;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * (Problem)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:13:30
 */
public interface ProblemService {


    @Transactional
    List<Problem> findProblem(@RequestParam("page") Integer page, @RequestParam("userId") Integer userId, @RequestParam("problemKey") String problemKey, @RequestParam("limit") Integer limit, @RequestParam("difficulty") String difficulty, @RequestParam("submitresult") String submitResult);

    @Transactional
    UserPerformance findUserPerFormance(Integer userId) throws ExecutionException, InterruptedException;

    @Transactional
    Problemdesc findProblemDesc(Integer problemId) throws ExecutionException, InterruptedException;
}
