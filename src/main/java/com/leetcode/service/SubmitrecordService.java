package com.leetcode.service;

import com.leetcode.mapper.SubmitrecordMapper;
import com.leetcode.vo.Submitrecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SubmitrecordService {

    @Resource
    private SubmitrecordMapper submitrecordMapper;

    public List<Submitrecord> getByUserId(String userId) {
        return submitrecordMapper.getByUserId(userId);
    }

}
