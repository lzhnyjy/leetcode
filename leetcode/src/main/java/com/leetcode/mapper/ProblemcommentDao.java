package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Problemcomment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Problemcomment)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:13:00
 */
@Repository
public interface ProblemcommentDao extends BaseMapper<Problemcomment> {



}

