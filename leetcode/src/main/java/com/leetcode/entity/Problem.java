package com.leetcode.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Problem {
    @TableId(value = "problemId",type = IdType.AUTO)//在自增主键的变量加上即可
    @TableField("`problemId`")
    private int problemId; // 题目编号

    @TableField("`problemName`")
    private String problemName; //题目名称

    @TableField("`solutionNumber`")
    private Integer solutionNumber;//题解数量

    @TableField("`passRate`")
    private float passRate ;//通过率

    @TableField("`difficulty`")
    private String difficulty; //难度(1简单、2普通、3困难)

    @TableField("`occurrenceRate`")
    private float occurrenceRate; // 出现率

    @TableField("`submitResult`")
    private Integer submitResult; // 用户的做题记录
}
