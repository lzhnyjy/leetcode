package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Problem)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:13:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problem implements Serializable {
    private static final long serialVersionUID = -95476402371032977L;
    /**
     * 题目编号
     */
    private Integer problemid;
    /**
     * 题目名称
     */
    private String problemname;
    /**
     * 题解数量
     */
    private Integer solutionnumber;
    /**
     * 通过率
     */
    private Object passrate;
    /**
     * 难度(1简单、2普通、3困难)
     */
    private Integer difficulty;
    /**
     * 出现率
     */
    private Object occurrencerate;


}
