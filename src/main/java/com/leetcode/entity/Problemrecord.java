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
public class Problemrecord {
    @TableId(value = "userId",type = IdType.AUTO)//在自增主键的变量加上即可
    @TableField("`userId`")
    private Integer userId;// 用户id
    @TableField("`problemId`")
    private Integer problemId; //题目id
    @TableField("`problemRecord`")
    private Integer problemRecord; // 做题记录
}
