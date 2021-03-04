package com.leetcode.controller;

import com.alibaba.fastjson.JSONObject;
import com.leetcode.common.AppConstant;
import com.leetcode.service.ProblemcommentService;
import com.leetcode.service.SolutioncommentService;
import com.leetcode.service.SubmitrecordService;
import com.leetcode.vo.Problemcomment;
import com.leetcode.vo.Solutioncomment;
import com.leetcode.vo.Submitrecord;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/leetcode/user/")
public class UserController {

    @Resource
    private SubmitrecordService submitrecordService;
    @Resource
    private ProblemcommentService problemcommentService;
    @Resource
    private SolutioncommentService solutioncommentService;

    /**
     * 提交记录
     *
     * @param userId 用户ID
     */
    @GetMapping("/submission/{userId}")
    public Object submission(@PathVariable(name = "userId") String userId, HttpServletRequest req) {
        JSONObject result = new JSONObject();
        String token = req.getHeader("token");
        if (StringUtils.isEmpty(userId)) {
            result.put("code", 4001);
            result.put("message", "用户ID不能为空！");
            return result;
        }
        if (StringUtils.isEmpty(token)) {
            result.put("code", 4002);
            result.put("message", "token验证失败！");
            return result;
        }
        String tokenInSession = (String) req.getSession().getAttribute(AppConstant.TOKEN);
        if (!token.equals(tokenInSession)) {
            result.put("code", 4003);
            result.put("message", "token验证失败！");
            return result;
        }
        List<Submitrecord> list = submitrecordService.getByUserId(userId);
        result.put("code", 200);
        result.put("message", "获取记录成功");
        JSONObject data = new JSONObject();
        data.put("submission", list);
        result.put("data", data);
        return result;
    }

    /**
     * 获取讨论发布
     *
     * @param userId 用户ID
     */
    @GetMapping("/discussion/{userId}")
    public Object discussion(@PathVariable(name = "userId") String userId, HttpServletRequest req) {
        JSONObject result = new JSONObject();
        if (StringUtils.isEmpty(userId)) {
            result.put("code", 4001);
            result.put("message", "用户ID不能为空！");
            return result;
        }
        String token = req.getHeader("token");
        if (StringUtils.isEmpty(token)) {
            result.put("code", 4002);
            result.put("message", "token验证失败！");
            return result;
        }
        String tokenInSession = (String) req.getSession().getAttribute(AppConstant.TOKEN);
        if (!token.equals(tokenInSession)) {
            result.put("code", 4003);
            result.put("message", "token验证失败！");
            return result;
        }
        List<Problemcomment> problemcomments = problemcommentService.getByUserId(userId);
        List<Solutioncomment> solutioncomments = solutioncommentService.getByUserId(userId);
        result.put("code", 200);
        result.put("message", "获取记录成功");
        JSONObject data = new JSONObject();
        data.put("problemComment", problemcomments);
        data.put("solutionComment", solutioncomments);
        result.put("data", data);
        return result;
    }

}
