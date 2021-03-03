package com.leetcode.mapper;

import com.leetcode.entity.dto.ProblemLikeDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeMapper {

    //查询点赞状态  注意like为关键字 用``包住
    @Select("SELECT * FROM problemlike where problemId=#{problemId} AND userId=#{userId}")
    ProblemLikeDto queryLikeStatus(int problemId, Integer userId);

    //增加点赞记录
    @Insert("INSERT INTO problemlike (problemId,userId) VALUES (#{problemId},#{userId})")
    void addLikeRecord(int problemId, Integer userId);

    //减少点赞记录
    @Delete("DELETE FROM problemlike WHERE problemId=#{problemId} AND userId=#{userId}")
    void deleteLikeRecord(int problemId, Integer userId);

}
