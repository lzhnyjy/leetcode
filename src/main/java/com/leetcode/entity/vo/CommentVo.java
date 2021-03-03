package com.leetcode.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回给前端的评论信息
 * 需要根据点赞数目，排序，找到5条最精彩的评论
 * 剩下的评论通过分页查询排序
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentVo {

    private int commentId;
    private Integer userId;
    private String username;
    private String image;
    private String commentContent;
    private String commentDatetime;
    private int commentLikeNumber;

}
