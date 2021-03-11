package com.leetcode.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装返回给前端的LabelBean
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelVo {

    private int labelId;
    private String labelName;

}
