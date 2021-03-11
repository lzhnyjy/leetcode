package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的示例表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleInfoPo {

    private int exampleId;
    private String exampleInput;
    private String exampleOutput;
    private String exampleExplain;
    private String exampleImage;
    private int problemId;

}
