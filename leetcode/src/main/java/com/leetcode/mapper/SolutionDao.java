package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface SolutionDao extends BaseMapper<Solution> {



}

