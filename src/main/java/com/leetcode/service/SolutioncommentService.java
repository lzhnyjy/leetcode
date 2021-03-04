package com.leetcode.service;

import com.leetcode.mapper.SolutioncommentMapper;
import com.leetcode.vo.Solutioncomment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SolutioncommentService {

    @Resource
    private SolutioncommentMapper solutioncommentMapper;

    public List<Solutioncomment> getByUserId(String userId) {
        return solutioncommentMapper.getByUserId(userId);
    }

}
