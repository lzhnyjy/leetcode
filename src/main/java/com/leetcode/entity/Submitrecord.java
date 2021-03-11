package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Submitrecord)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:11:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Submitrecord implements Serializable {
    private static final long serialVersionUID = -39182831243264011L;
    /**
     * 用户编号
     */
    private Integer userid;
    /**
     * 题目编号
     */
    private Integer problemid;
    /**
     * 提交时间
     */
    private Date submitdatetime;
    /**
     * 运行结果(编译出错0、运行出错1、运行成功2)
     */
    private Integer submitresult;
    /**
     * 编译器提供信息
     */
    private String runresult;
    /**
     * 语言
     */
    private String language;



}
