package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的题解标签表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelSolutionPo {

    private int labelId;
    private int solutionId;

}
