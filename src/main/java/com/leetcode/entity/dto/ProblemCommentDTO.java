package com.leetcode.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author William
 * @title: ProblemCommentDTO
 * @description: TODO
 * @date 2021/3/10
 */
@Getter
@Setter
public class ProblemCommentDTO {
    private Integer problemId;

    private Integer userId;

    private String commentContent;

    private Integer parentId;

    private Date commentDatetime;
}
