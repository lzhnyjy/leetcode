package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.io.Serializable;
import java.util.List;


/**
 * (Solution)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:12:36
 */
@Data

@Alias("solution")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Solution implements Serializable {

    /**
     * 题解id
     */
    private Integer solutionId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户头像
     */
    private String image;
    /**
     * 题目id
     */
    private Integer problemId;
    /**
     * 题解文字部分
     */
    private String solutionText;
    /**
     * 发布时间
     */
    private Date solutionDatetime;
    /**
     * 观看次数
     */
    private Integer visitedNumber;
    /**
     * 是否为官方题解
     */
    private Integer isOfficial;
    /**
     * 题解点赞数量
     */
    private Integer solutionLikeNumber;
    /**
     * 题解评论数量
     */
    private Integer solutionCommentNumber;
    /**
     * 题解名称
     */
    private String solutionName;
    /**
     * 题解标签
     */
    private List<Label> labelList;

    private List<Integer> labelIds;

}
