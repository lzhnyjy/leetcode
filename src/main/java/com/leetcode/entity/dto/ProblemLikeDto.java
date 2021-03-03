package com.leetcode.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的like点赞记录表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemLikeDto {

    private int problemId;
    private Integer userId;

}
