package com.leetcode.mapper;


import com.leetcode.entity.dto.SubmitRecordDto;
import com.leetcode.entity.vo.SubmitMessageVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SubmissionMapper {

    //查询提交信息集合
    @Select("SELECT submitDateTime,submitResult,runTime,useCpu,`language` FROM submitrecord WHERE userId=#{userId} AND problemId=#{problemId}")
    List<SubmitMessageVo> querySubmitMessageById(@Param("userId") Integer userId, @Param("problemId") int problemId);

    //查询编译器编译信息
    @Select("SELECT runResult FROM submitrecord WHERE userId=#{userId} AND problemId=#{problemId}")
    String queryRunResult(@Param("userId") Integer userId,@Param("problemId") int problemId);


    //提交代码，存入一条记录
    @Insert("INSERT INTO submitrecord (userId,problemId,submitDateTime,submitResult,runResult,runTime,useCpu,`language`) VALUES (#{userId},#{problemId},#{submitDateTime},#{submitResult},#{runResult},#{runTime},#{useCpu},#{language})")
    void submitCode(SubmitRecordDto submitRecordDto);


}
