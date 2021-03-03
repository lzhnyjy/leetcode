package com.leetcode.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 返回给前端的关于代码执行或者提交的信息SubmitBean
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubmitVo {

    private String runResult;
    private List<SubmitMessageVo> submitMessageVoList;

}
