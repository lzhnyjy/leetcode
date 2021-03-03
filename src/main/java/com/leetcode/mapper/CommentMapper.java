package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.vo.CommentVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper extends BaseMapper<CommentVo> {

    /**
     * 查询题目评论的总数
     * @param problemId
     * @return
     */
    @Select("SELECT COUNT(p.problemId) FROM problemcomment p WHERE p.problemId=#{problemId}")
     int queryProblemCommentTotal(@Param("problemId")int problemId);


    /**
     * 根据评论的点赞数目排序精彩评论
     * @param problemId
     * @return
     */
    @Select("SELECT p.commentId,p.userId,u.username,u.image,p.commentContent, p.commentDatetime, p.commentLikeNumber FROM problemcomment p,`user` u WHERE p.problemId=2 AND p.userId=u.userId ORDER BY p.commentLikeNumber DESC LIMIT 0,5")
    List<CommentVo> queryCommentByProblemIdBest(@Param("problemId") int problemId);

    /**
     * 根据题目ID分页查询有关题目的所有评论
     * @param problemId
     * @param start
     * @param limit
     * @return
     */
    @Select("SELECT p.commentId,p.userId,u.username,u.image,p.commentContent, p.commentDatetime, p.commentLikeNumber FROM problemcomment p,`user` u WHERE p.problemId=2 AND p.userId=u.userId ORDER BY p.commentDatetime DESC LIMIT #{start},#{limit}")
    List<CommentVo> queryCommentByProblemId(@Param("problemId") int problemId, @Param("start") int start, @Param("limit") int limit);


}
