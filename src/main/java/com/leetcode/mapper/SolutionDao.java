package com.leetcode.mapper;

import com.leetcode.entity.Label;
import com.leetcode.entity.Solution;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Solution)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:12:36
 */
@Repository
public interface SolutionDao {


    /**
     * @return java.util.List<com.leetcode.entity.Solution>
     * @Author lzh
     * @Description //TODO 搜索题解/题解排序/翻页
     * @Date 23:21 2021/2/23
     * @Param [problemId, solutionKey, solutionOrderType, solutionType]
     **/
    List<Solution> solution(@Param("problemId") Integer problemId,
                            @Param("solutionKey") String solutionKey,
                            @Param("solutionOrderType") Integer solutionOrderType,
                            @Param("solutionType") List<String> solutionType);


    List<Label> selectLabel(@Param("solutionId") Integer solutionId);

    Solution selectSolutionById(@Param("solutionId") Integer solutionId);

    void addVisitedNumber(@Param("solutionId") Integer solutionId);

    Integer addLikeNumber(@Param("type") Integer type, @Param("targetType") Integer targetType, @Param("Id") Integer solutionId);

    Integer selectLikeNumberById(@Param("targetType") Integer targetType, @Param("Id") Integer solutionId);

    Integer addSolution(@Param("solution") Solution solution);

    Integer addSolutionLabel(@Param("solution") Solution solution);

    Integer addCommentNumbers(@Param("solutionId") Integer solutionId);

    Integer addSolutionLike(@Param("solutionId") Integer solutionId, @Param("userId") Integer userId);

    Integer delSolutionLike(@Param("solutionId") Integer solutionId, @Param("userId") Integer userId);

}

