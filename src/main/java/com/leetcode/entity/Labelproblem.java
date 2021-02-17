package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Labelproblem)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:14:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Labelproblem implements Serializable {
    private static final long serialVersionUID = 673379367413013758L;
    /**
     * 标签id
     */
    private Integer labelid;
    /**
     * 题目id
     */
    private Integer problemid;


}
