package com.leetcode.service;

import com.leetcode.entity.vo.RestInfo;

public interface LikeService {

    //查询当前用户的点赞状态
    String queryLikeStatus(int problemId, Integer userId);

    //改变点赞状态
    RestInfo changeLikeStatus(int problemId, Integer userId);

}
