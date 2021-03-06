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
@NoArgsConstructor
@AllArgsConstructor
public class Labelproblem {
    @TableId(value = "labelId",type = IdType.AUTO)//在自增主键的变量加上即可
    @TableField("`labelId`")
    private Integer labelId;
    @TableId(value = "id",type = IdType.AUTO)//在自增主键的变量加上即可
    @TableField("`problemId`")
    private Integer problemId;
}
