package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Exampleinfo)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:14:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exampleinfo implements Serializable {
    private static final long serialVersionUID = 924102339850784709L;
    /**
     * 示例id
     */
    private Integer exampleid;
    /**
     * 输入
     */
    private String exampleinput;
    /**
     * 输出
     */
    private String exampleoutput;
    /**
     * 解释
     */
    private String exampleexplain;
    /**
     * 示例图片
     */
    private String exampleimage;
    /**
     * 题目id
     */
    private Integer problemid;


}
