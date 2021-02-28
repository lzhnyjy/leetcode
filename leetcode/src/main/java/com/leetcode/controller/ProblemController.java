package com.leetcode.controller;

import com.leetcode.entity.Problem;
import com.leetcode.entity.Problemdesc;
import com.leetcode.entity.UserPerformance;
import com.leetcode.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * (Problem)表控制层
 *
 * @author makejava
 * @since 2021-02-17 21:13:30
 */
@Controller
@RequestMapping("problem")
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    /**
     * 获取用户的做题情况
     * @param userId  用户id
     * @return
     */
    @ResponseBody
    @RequestMapping("/leetcode/question/user/{userId}")
    public UserPerformance findUserPerformance(@PathVariable("userId") Integer userId){
        UserPerformance userPerFormance = null;
        try {
            userPerFormance = problemService.findUserPerFormance(userId);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return   userPerFormance;
    }
    /**
     * 分页展示数据
     * @param request 请求
     * @return
     */
    @RequestMapping("/leetcode/question/{page}/{userId}")
    @ResponseBody
    public List<Problem> findProblem(HttpServletRequest request, @PathVariable("page")Integer page, @PathVariable("userId") Integer userId){
        String problemKey = request.getParameter("problemKey");
        String limit = request.getParameter("limit");
        int limit1;
//        默认paseSize 长度为 50
        if (limit == null || "".equals(limit)){
            limit1 = 50;
        }
        else
        {
            limit1 = Integer.parseInt(limit);
        }
        String difficult = request.getParameter("difficult");
        String submitResult = request.getParameter("submitResult");
        return problemService.findProblem(page, userId, problemKey, limit1, difficult, submitResult);
    }

    /**
     * 根据题目id 展示题目的详细信息
     * @param problemId 题目id
     * @return
     */
    @RequestMapping("/leetcode/question/{randomId}")
    @ResponseBody
    public Problemdesc findProblemDexc(@PathVariable("randomId") Integer problemId){
        Problemdesc problemDesc = null;
        try {
            problemDesc = problemService.findProblemDesc(problemId);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return problemDesc;
    }

}
