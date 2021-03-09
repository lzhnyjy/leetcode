package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Problemrecord;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRecordDao extends BaseMapper<Problemrecord>{

}
