package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的题解图片表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolutionImagePo {

    private int solutionImageId;
    private String solutionImageUrl;
    private int solutionId;

}
