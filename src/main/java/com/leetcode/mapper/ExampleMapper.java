package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.dto.ExampleDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleMapper extends BaseMapper<ExampleDto> {

    @Select("SELECT * FROM exampleinfo WHERE problemId = #{problemId}")
    List<ExampleDto> queryExampleByProblemId(@Param("problemId") int problemId);

}
