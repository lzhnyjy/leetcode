package com.leetcode.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 对应前端代码提交传来的数据
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubmitMessageDto {

    private String codeMessage;
    private Integer userId;
    private int problemId;

}
