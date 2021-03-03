package com.leetcode.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leetcode.entity.vo.CommentVo;
import com.leetcode.entity.vo.PageListVo;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.mapper.CommentMapper;
import com.leetcode.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, CommentVo> implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    /**
     * 所有评论并分页,查询出五条精彩评论
     * @param problemId
     * @param page
     * @param limit
     * @return
     */
    @Override
    public RestInfo queryProblemComments(int problemId, int page, int limit) {
        int total = commentMapper.queryProblemCommentTotal(problemId);
        int start = (page - 1) * limit;
        if (total!=0){
        List<CommentVo> wonderfulComment = commentMapper.queryCommentByProblemIdBest(problemId);
        List<CommentVo> otherComment = commentMapper.queryCommentByProblemId(problemId, start, limit);
            int totalPage = total % limit == 0 ? total / limit : total / limit + 1;
            return RestInfo.success(new PageListVo(total, page, totalPage, limit, wonderfulComment, otherComment));
        }
        return RestInfo.success("题目暂时还没有评论");
    }

}
