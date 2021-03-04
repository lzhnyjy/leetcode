package com.leetcode.controller;

import com.alibaba.fastjson.JSONObject;
import com.leetcode.common.AppConstant;
import com.leetcode.service.UserService;
import com.leetcode.utils.CaptchaUtils;
import com.leetcode.vo.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("/leetcode/accounts/")
public class AccountsController {

    @Resource
    private UserService userService;

    /**
     * 获取验证码
     *q
     * @param phone 手机号
     */
    @PostMapping("/login/phone/checkcode/{phone}")
    public Object checkcode(@PathVariable(name = "phone") String phone) {
        int code = (int) ((Math.random() * 9 + 1) * 100000);
        CaptchaUtils.getInstance().put(phone, String.valueOf(code));
        JSONObject result = new JSONObject();
        result.put("code", 200);
        result.put("message", String.valueOf(code));
        return result;
    }

    /**
     * 手机号登录
     *
     * @param phone 手机号
     * @param code  验证码
     */
    @PostMapping("/login/phone/{phone}/{code}")
    public Object phoneLogin(@PathVariable(name = "phone") String phone, @PathVariable(name = "code") String code, HttpServletRequest req) {
        JSONObject result = new JSONObject();
        if (StringUtils.isEmpty(phone)) {
            result.put("code", 401);
            result.put("message", "手机号不能为空！");
            return result;
        }
        if (StringUtils.isEmpty(code)) {
            result.put("code", 402);
            result.put("message", "验证码不能为空！");
            return result;
        }
        String codeInSave = CaptchaUtils.getInstance().get(phone);
        if (!code.equals(codeInSave)) {
            result.put("code", 403);
            result.put("message", "验证码错误！");
            return result;
        }
        User user = userService.getByPhone(phone);
        result.put("code", 200);
        result.put("message", "登录成功");
        JSONObject data = new JSONObject();
        String token = UUID.randomUUID().toString();
        req.getSession().setAttribute(AppConstant.TOKEN, token);
        data.put("user", user);
        data.put("token", token);
        result.put("data", data);
        return result;
    }

    /**
     * 手机号/邮箱登录
     *
     * @param account  手机号/邮箱
     * @param password 密码
     */
    @GetMapping("/login")
    public Object login(String account, String password, HttpServletRequest req) {
        JSONObject result = new JSONObject();
        if (StringUtils.isEmpty(account)) {
            result.put("code", 401);
            result.put("message", "账户不能为空！");
            return result;
        }
        if (StringUtils.isEmpty(password)) {
            result.put("code", 402);
            result.put("message", "密码不能为空！");
            return result;
        }
        User user = userService.getByPhone(account);
        if (user == null) {
            user = userService.getByEmail(account);
            if (user == null) {
                result.put("code", 403);
                result.put("message", "用户不存在！");
                return result;
            }
        }
        if (!password.equals(user.getPassword())) {
            result.put("code", 404);
            result.put("message", "密码错误！");
            return result;
        }
        result.put("message", "登录成功");
        result.put("code", 200);
        JSONObject data = new JSONObject();
        data.put("user", user);
        String token = UUID.randomUUID().toString();
        req.getSession().setAttribute(AppConstant.TOKEN, token);
        data.put("token", token);
        result.put("data", data);
        return result;
    }

    /**
     * 邮箱注册
     *
     * @param email    邮箱
     * @param password 密码
     * @param username 用户名
     */
    @PostMapping("/register/email")
    public Object register(String email, String password, String username) {
        JSONObject result = new JSONObject();
        if (StringUtils.isEmpty(email)) {
            result.put("code", 401);
            result.put("message", "邮箱不能为空！");
            return result;
        }
        if (StringUtils.isEmpty(password)) {
            result.put("code", 402);
            result.put("message", "密码不能为空！");
            return result;
        }
        if (StringUtils.isEmpty(username)) {
            result.put("code", 403);
            result.put("message", "用户名不能为空！");
            return result;
        }
        User user = userService.getByUsername(username);
        if (user != null) {
            result.put("code", 404);
            result.put("message", "用户名已存在！");
            return result;
        }
        user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        userService.add(user);
        result.put("code", 200);
        result.put("message", "注册成功");
        return result;
    }

}