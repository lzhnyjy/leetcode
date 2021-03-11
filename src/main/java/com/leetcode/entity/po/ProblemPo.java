package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的题目表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemPo {

    private int problemId;
    private String problemName;
    private String solutionNumber;
    private float passRate;
    private int difficulty;
    private float occurrenceRate;

}
