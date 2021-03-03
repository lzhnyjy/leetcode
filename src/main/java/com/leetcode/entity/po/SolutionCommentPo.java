package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的题解评论表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolutionCommentPo {

    private int commentId;
    private int solutionId;
    private String commentContent;
    private Integer userId;
    private int parentId;
    private String commentDatetime;
    private int commentLikeNumber;

}
