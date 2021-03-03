package com.leetcode.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装点赞信息，返回给前端的LikeBean
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeVo {

    //点赞的对象id，可以是题目id，题解id，评论id
    private int id;
    private Integer userId;
    //1表示给题目点赞，2表示给题解点赞，3表示给评论点赞
    private int type;

}
