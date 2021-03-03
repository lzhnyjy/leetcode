package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的题目评论表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemCommentPo {

    private int commentId;
    private int problemId;
    private String commentContent;
    private Integer userId;
    private int parentId;
    private String commentDatetime;
    private int commentLikeNumber;

}
