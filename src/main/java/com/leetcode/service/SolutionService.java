package com.leetcode.service;

import com.leetcode.entity.Label;
import com.leetcode.entity.Solution;
import org.apache.ibatis.annotations.Param;


import java.util.List;



/**
 * (Solution)表服务接口
 *
 * @author protagonist
 * @since 2021-02-18 20:11:21
 */
public interface SolutionService {

   List<Solution> solution(Integer problemId, String solutionKey, Integer solutionOrderType, String solutionType);

   List<Label> selectLabel(Integer solutionId);

   Solution selectSolutionById(Integer solutionId);

   void addSolutionVisitedNumber(Integer solutionId);

   Integer addSolutionLikeNumber(Integer type,Integer targetType,Integer solutionId);

   Integer selectLikeNumberById(Integer targetType,Integer solutionId);

   Integer addSolution(Solution solution);

    Integer addSolutionLabel(Solution solution);
    
}
