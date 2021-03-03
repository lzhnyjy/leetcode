package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.dto.ProblemDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Repository
public interface ProblemMapper extends BaseMapper<ProblemDto> {

    //根据ProblemId查询一篇题目的详细内容
    @Select("SELECT problemdesc.*,problem.problemName FROM problem,problemdesc WHERE problem.problemId = #{problemId} AND problem.problemId = problemdesc.problemId")
    ProblemDto queryProblemById(@Param("problemId") int problemId);

    //改变题目的点赞数属性
    @Update("UPDATE problemdesc SET problemLikeNumber=problemLikeNumber+#{variation} WHERE problemId=#{problemId}")
    void changeProblemLikeNumber(@Param("problemId") int problemId, @Param("variation") int variation);
}
