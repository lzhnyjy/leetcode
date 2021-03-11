package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leetcode.entity.Label;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author lzh
 */
@Repository
public interface LabelDao {
    List<Label> selectAllLabels();

    Label selectOne(QueryWrapper<Label> lw);
}
