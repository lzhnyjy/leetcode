package com.leetcode.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户做题返回给前端的提交记录具体信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubmitMessageVo {

    private String submitDateTime;
    //运行结果(0编译出错、1运行出错、2运行成功)
    private int submitResult;
    private String runTime;
    private String useCpu;
    private String language;

}
