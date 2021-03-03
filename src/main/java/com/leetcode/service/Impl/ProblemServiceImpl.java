package com.leetcode.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leetcode.entity.dto.ExampleDto;
import com.leetcode.entity.dto.LabelDto;
import com.leetcode.entity.dto.ProblemDto;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.mapper.ExampleMapper;
import com.leetcode.mapper.LabelMapper;
import com.leetcode.mapper.ProblemMapper;
import com.leetcode.service.LikeService;
import com.leetcode.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl extends ServiceImpl<ProblemMapper, ProblemDto> implements ProblemService {

    @Autowired
    private ProblemMapper problemMapper;

    @Autowired
    private ExampleMapper exampleMapper;

    @Autowired
    private LabelMapper labelMapper;

    @Autowired
    LikeService likeService;

    /**
     * 根据Id查询题目的详细信息
     * @param problemId
     * @param userId
     * @return
     */
    @Override
    public RestInfo queryProblemById(int problemId, Integer userId) {
        ProblemDto problemDto = problemMapper.queryProblemById(problemId);
        List<ExampleDto> exampleDtoList = exampleMapper.queryExampleByProblemId(problemId);
        List<LabelDto> labelDtoList = labelMapper.queryLabelByProblemId(problemId);
        if (userId != null && problemDto!=null) {
            //查询用户的点赞情况
            String likeStatus = likeService.queryLikeStatus(problemId, userId);
            problemDto.setLikeStatus(likeStatus);
            problemDto.setExampleDtoList(exampleDtoList);
            problemDto.setLabelDtoList(labelDtoList);
            return RestInfo.success("题目的具体信息", problemDto);
        }
        return RestInfo.success("题目的具体信息",problemDto);
    }
}
