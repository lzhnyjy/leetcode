package com.leetcode.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装返回前端的exampleBean
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleDto {

    private int exampleId;
    private String exampleInput;
    private String exampleOutput;
    private String exampleExplain;
    private String exampleImage;

}
