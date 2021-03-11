package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.dto.LabelDto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabelMapper extends BaseMapper<LabelDto> {

    //根据题目ID查询题目的相关标签内容
    @Select("SELECT label.labelId,label.labelName FROM labelproblem,label WHERE labelproblem.problemId=#{problemId} AND labelproblem.labelId=label.labelId")
    List<LabelDto> queryLabelByProblemId(int problemId);

}
