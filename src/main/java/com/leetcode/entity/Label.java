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
public class Label {
    @TableId(value = "labelId",type = IdType.AUTO)//在自增主键的变量加上即可
    @TableField("`labelId`")
    private Integer labelId;// 标签id
    @TableField("`labelName`")
    private String labelName ; //标签名
}
