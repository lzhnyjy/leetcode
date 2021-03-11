package com.leetcode.entity;

/**
 * @author William
 * @title: ProblemCommentLike
 * @description: TODO
 * @date 2021/3/10
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("problemcommentlike")
public class ProblemCommentLike {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer commentId;

    private Integer userId;

    private Integer likeStatus;
}
