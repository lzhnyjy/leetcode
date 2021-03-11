package com.leetcode.entity.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author William
 * @title: ProblemCommentLikeDTO
 * @description: TODO
 * @date 2021/3/10
 */
@Getter
@Setter
public class ProblemCommentLikeDTO {
    private Integer userId;

    private Integer commentId;

    private Integer likeStatus;
}
