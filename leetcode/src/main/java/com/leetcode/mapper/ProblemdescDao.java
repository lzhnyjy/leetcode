package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Problemdesc;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Problemdesc)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-1 21:12:46
 */
@Repository
public interface ProblemdescDao extends BaseMapper<Problemdesc> {



}

