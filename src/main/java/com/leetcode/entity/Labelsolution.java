package com.leetcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Labelsolution)实体类
 *
 * @author makejava
 * @since 2021-02-7 21:13:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Labelsolution implements Serializable {
    private static final long serialVersionUID = 960204736667888993L;
    /**
     * 标签id
     */
    private Integer labelid;
    /**
     * 题解id
     */
    private Integer solutionid;


    public Integer getLabelid() {
        return labelid;
    }
}
