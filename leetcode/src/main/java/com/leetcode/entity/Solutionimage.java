package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Solutionimage)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:11:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Solutionimage implements Serializable {
    private static final long serialVersionUID = -83583237098347622L;
    /**
     * 题解图片id
     */
    private Integer solutionimageid;
    /**
     * 题解图片的url
     */
    private String solutionimageurl;
    /**
     * 题解id
     */
    private Integer solutionid;



}
