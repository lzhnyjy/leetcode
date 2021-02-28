package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Labelproblem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Labelproblem)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:14:01
 */
@Repository
public interface LabelproblemDao extends BaseMapper<Labelproblem> {


}

