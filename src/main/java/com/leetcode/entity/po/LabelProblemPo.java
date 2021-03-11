package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的题目标签表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LabelProblemPo {

    private int labelId;
    private int problemId;

}
