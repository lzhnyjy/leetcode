package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的标签表Label
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelPo {

    private int labelId;
    private String labelName;

}
