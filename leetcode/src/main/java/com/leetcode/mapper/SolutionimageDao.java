package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Solutionimage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Solutionimage)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:11:32
 */
@Repository
public interface SolutionimageDao extends BaseMapper<Solutionimage> {



}

