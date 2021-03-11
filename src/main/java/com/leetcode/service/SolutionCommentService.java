package com.leetcode.service;/**
 * @Author lzh
 */

import com.leetcode.entity.SolutionComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName solutionCommentService
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/24 12:04
 * @Version 1.0
 */
public interface SolutionCommentService {
    List<SolutionComment> selectCommentBySolutionId( Integer solutionId);

    Integer addSolutionComment(SolutionComment solutionComment);

    SolutionComment selectOneComment(Integer solutionId,Integer commentId);

    Integer selectTopMostCommentId(Integer parentId);
}
