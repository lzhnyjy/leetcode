package com.leetcode.mapper;

import com.leetcode.vo.Solutioncomment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SolutioncommentMapper {

    List<Solutioncomment> getByUserId(String userId);

}
