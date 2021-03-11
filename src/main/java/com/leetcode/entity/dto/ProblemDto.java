package com.leetcode.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 封装题目的具体信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDto {

    private int problemId;
    private String problemName;
    private int difficulty;
    private int problemLikeNumber;
    private String problemContent;
    private String tipsInfo;
    private int passNumber;
    private int submitNumber;
    private String likeStatus;
    private List<ExampleDto> exampleDtoList;
    private List<LabelDto> labelDtoList;
}
