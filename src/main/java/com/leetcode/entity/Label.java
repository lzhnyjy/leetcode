package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Label)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:14:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Label implements Serializable {
    private static final long serialVersionUID = -54603306286375125L;
    /**
     * 标签id
     */
    private Integer labelid;
    /**
     * 标签名
     */
    private String labelname;


}
