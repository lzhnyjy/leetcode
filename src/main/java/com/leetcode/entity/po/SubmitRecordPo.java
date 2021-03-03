package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的提交记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubmitRecordPo {

    private Integer userId;
    private int problemId;
    private String submitDateTime;
    private int submitResult;
    private String runResult;
    private String runTime;
    private String useCpu;
    private String language;

}
