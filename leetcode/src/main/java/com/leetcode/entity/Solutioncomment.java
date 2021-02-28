package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Solutioncomment)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:11:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solutioncomment implements Serializable {
    private static final long serialVersionUID = 525402369815055239L;
    /**
     * 题解评论id
     */
    private Integer commentid;
    /**
     * 题解id
     */
    private Integer solutionid;
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
