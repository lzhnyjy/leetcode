package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的题解表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolutionPo {

    private int solutionId;
    private Integer userId;
    private int problemId;
    private String solutionName;
    private String solutionText;
    private String solutionCode;
    private String solutionDatetime;
    private int visitedNumber;
    private boolean isOfficial;
    private int solutionLikeNumber;
    private int solutionCommentNumber;

}
