package com.leetcode.mapper;

import com.leetcode.vo.Submitrecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubmitrecordMapper {

    List<Submitrecord> getByUserId(String userId);

}
