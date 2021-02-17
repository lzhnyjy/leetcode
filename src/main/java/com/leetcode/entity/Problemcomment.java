package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Problemcomment)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:13:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problemcomment implements Serializable {
    private static final long serialVersionUID = 764522287473023562L;
    /**
     * 题目评论id
     */
    private Integer commentid;
    /**
     * 评论对应的题目的id
     */
    private Integer problemid;
    /**
     * 评论内容
     */
    private String commentcontent;
    /**
     * 发出评论的用户id
     */
    private Integer userid;
    /**
     * 指向的父评论id
     */
    private Integer parentid;
    /**
     * 评论的日期时间
     */
    private Date commentdatetime;
    /**
     * 评论点赞数
     */
    private Integer commentlikenumber;



}
