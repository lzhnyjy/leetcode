package com.leetcode.service.impl;/**
 * @Author lzh
 */

import com.leetcode.entity.Label;
import com.leetcode.entity.Solution;
import com.leetcode.mapper.SolutionDao;
import com.leetcode.service.SolutionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SolutionServiceImpl
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/23 11:27
 * @Version 1.0
 */
@Service
public class SolutionServiceImpl implements SolutionService {

    @Autowired
    private SolutionDao solutionDao;

    @Override
    public List<Solution> solution(Integer problemId, String solutionKey, Integer solutionOrderType, String solutionType){
        List<String> splitSolutionType=null;
        if ("null".equalsIgnoreCase(solutionKey)) {
            solutionKey=null;
        }
        if("null".equalsIgnoreCase(solutionType)){
            solutionType=null;
        }else{
            splitSolutionType = Arrays.asList(solutionType.split("-"));
        }
        List<Solution> solution = solutionDao.solution(problemId, solutionKey, solutionOrderType, splitSolutionType);
        return solution;
    }

    @Override
    public List<Label> selectLabel(Integer solutionId) {
        List<Label> labels = solutionDao.selectLabel(solutionId);
        return labels;
    }

    @Override
    public Solution selectSolutionById(Integer solutionId) {
        Solution solution = solutionDao.selectSolutionById(solutionId);
        return solution;
    }

    @Override
    public void addSolutionVisitedNumber(Integer solutionId) {
        solutionDao.addVisitedNumber(solutionId);
    }

    @Override
    public Integer addSolutionLikeNumber(Integer type,Integer targetType,Integer Id) {
        solutionDao.addLikeNumber(type,targetType,Id);
        Integer likeNumber = selectLikeNumberById(targetType,Id);
        return likeNumber;
    }

    @Override
    public Integer selectLikeNumberById(Integer targetType,Integer Id){
        Integer likeNumber = solutionDao.selectLikeNumberById(targetType,Id);
        return likeNumber;
    }

    @Override
    public Integer addSolution(Solution solution){
        Integer integer = solutionDao.addSolution(solution);
        return integer;
    }

    public Integer addSolutionLabel(Solution solution){
        Integer integer = solutionDao.addSolutionLabel(solution);
        return integer;
    }



}
