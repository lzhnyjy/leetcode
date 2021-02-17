package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Problemdesc)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:12:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problemdesc implements Serializable {
    private static final long serialVersionUID = 682205776099965576L;
    /**
     * 题目id
     */
    private Integer problemid;
    /**
     * 点赞数
     */
    private Integer problemlikenumber;
    /**
     * 题目内容
     */
    private String problemcontent;
    /**
     * 提示信息
     */
    private String tipsinfo;
    /**
     * 通过次数
     */
    private Integer passnumber;
    /**
     * 提交次数
     */
    private Integer submitnumber;



}
