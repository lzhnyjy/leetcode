package com.leetcode.service.Impl;

import com.leetcode.entity.dto.ProblemLikeDto;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.mapper.LikeMapper;
import com.leetcode.mapper.ProblemMapper;
import com.leetcode.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    LikeMapper likeMapper;
    @Autowired
    ProblemMapper problemMapper;


    /**
     * 查询当前用户的点赞状态
     * @param problemId
     * @param userId
     * @return
     */
    @Override
    public String queryLikeStatus(int problemId, Integer userId) {
        ProblemLikeDto likeDto = likeMapper.queryLikeStatus(problemId, userId);
        return likeDto == null ? "未点赞" : "已点赞";
    }

    /**
     * 改变点赞状态
     * @param problemId
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public RestInfo changeLikeStatus(int problemId, Integer userId) {
        ProblemLikeDto likeDto = likeMapper.queryLikeStatus(problemId, userId);
        int variation = 0;
        if (likeDto == null) {
            likeMapper.addLikeRecord(problemId, userId);
            variation = 1;
        } else {
            likeMapper.deleteLikeRecord(problemId, userId);
            variation = -1;
        }
        //改变题目的点赞数量
        problemMapper.changeProblemLikeNumber(problemId, variation);
        return RestInfo.success("改变题目点赞状态成功");
    }
}
