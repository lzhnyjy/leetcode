package com.leetcode.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leetcode.entity.dto.ProblemDto;
import com.leetcode.entity.vo.RestInfo;

public interface ProblemService extends IService<ProblemDto> {

    //查询文章详细信息
    RestInfo queryProblemById(int problemId , Integer userId);

}
