package com.leetcode.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leetcode.entity.vo.CommentVo;
import com.leetcode.entity.vo.RestInfo;

public interface CommentService extends IService<CommentVo> {

    //查询题目的所有评论,并查询出五条精彩评论
    RestInfo queryProblemComments(int problemId, int page, int limit);

}
