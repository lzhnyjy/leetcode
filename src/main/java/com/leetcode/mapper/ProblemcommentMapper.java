package com.leetcode.mapper;

import com.leetcode.vo.Problemcomment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProblemcommentMapper {

    List<Problemcomment> getByUserId(String userId);

}
