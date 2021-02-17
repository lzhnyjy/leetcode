package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Solution)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:12:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solution implements Serializable {
    private static final long serialVersionUID = 386170063189611923L;
    /**
     * 题解id
     */
    private Integer solutionid;
    /**
     * 用户id
     */
    private Integer userid;
    /**
     * 题目id
     */
    private Integer problemid;
    /**
     * 题解文字部分
     */
    private String solutiontext;
    /**
     * 题解代码部分
     */
    private String solutioncode;
    /**
     * 发布时间
     */
    private Date solutiondatetime;
    /**
     * 观看次数
     */
    private Integer visitednumber;
    /**
     * 是否为官方题解
     */
    private Integer isofficial;
    /**
     * 题解点赞数量
     */
    private Integer solutionlikenumber;
    /**
     * 题解评论数量
     */
    private Integer solutioncommentnumber;
    /**
     * 题解名称
     */
    private String solutionname;




}
