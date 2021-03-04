package com.leetcode.service;

import com.leetcode.mapper.ProblemcommentMapper;
import com.leetcode.vo.Problemcomment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProblemcommentService {

    @Resource
    private ProblemcommentMapper problemcommentMapper;

    public List<Problemcomment> getByUserId(String userId) {
        return problemcommentMapper.getByUserId(userId);
    }

}
