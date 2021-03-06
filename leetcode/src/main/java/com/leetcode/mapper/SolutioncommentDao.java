package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Solutioncomment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Solutioncomment)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:11:44
 */
@Repository
public interface SolutioncommentDao extends BaseMapper<Solutioncomment> {



}

