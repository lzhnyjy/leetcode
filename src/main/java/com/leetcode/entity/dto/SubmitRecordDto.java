package com.leetcode.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应代码提交的业务操作
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubmitRecordDto {

    private Integer userId;
    private int problemId;
    private String submitDateTime;
    private int submitResult;
    private String runResult;
    private String runTime;
    private String useCpu;
    private String language;

}
