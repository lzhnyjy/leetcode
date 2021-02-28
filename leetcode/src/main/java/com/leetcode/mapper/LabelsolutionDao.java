package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Labelsolution;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Labelsolution)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:13:49
 */
@Repository
public interface LabelsolutionDao extends BaseMapper<Labelsolution> {



}

