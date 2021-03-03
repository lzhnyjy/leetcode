package com.leetcode.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;


@Data
@Alias("label")
@AllArgsConstructor
@NoArgsConstructor
public class Label implements Serializable {
    /**
     * 标签id
     */
    private Integer labelId;
    /**
     * 标签名
     */
    private String labelName;

}
