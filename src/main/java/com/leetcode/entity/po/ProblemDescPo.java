package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库中的题目的具体信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDescPo {

    private int problemId;
    private int problemLikeNumber;
    private String problemContent;
    private String tipsInfo;
    private int passNumber;
    private int submitNumber;

}
