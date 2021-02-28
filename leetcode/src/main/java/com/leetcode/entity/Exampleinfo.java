package com.leetcode.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Exampleinfo {
    @TableField("'exampleId'") //示例id
   private String exampleId;
    @TableField("'exampleInput'") //输入
   private String exampleInput;
    @TableField("'exampleOutput'")//输出
   private String exampleOutput;
    @TableField("'exampleExplain'")//解释
   private String exampleExplain;
    @TableField("'exampleImage'")//示例图片
   private String exampleImage;
    @TableField("'problemId'")//题目id
   private String  problemId;
}
