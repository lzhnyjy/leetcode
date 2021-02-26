package com.leetcode.mapper;

import com.leetcode.entity.SolutionComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author lzh
 */
@Repository
public interface SolutionCommentDao {

    List<SolutionComment> selectCommentBySolutionId(@Param("solutionId") Integer solutionId);

    Integer addSolutionComment(@Param("solutionComment") SolutionComment solutionComment);

    SolutionComment selectTopMostCommentId(@Param("parentId") Integer parentId);
}
