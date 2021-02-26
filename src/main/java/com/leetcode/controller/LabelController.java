package com.leetcode.controller;/**
 * @Author lzh
 */

import com.leetcode.entity.Label;
import com.leetcode.response.Result;
import com.leetcode.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName LabelController
 * @Description //TODO 标签
 * @Author lzh
 * @Date 2021/2/25 11:41
 * @Version 1.0
 */
@RestController
@RequestMapping("question/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @GetMapping("/")
    public Result selectAllLabels(){
        List<Label> labels = labelService.selectAllLabels();
        return new Result(true, 200, "标签查询成功", labels);
    }


}
