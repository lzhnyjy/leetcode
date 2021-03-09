package com.leetcode.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author lzh
 */
@Repository
public interface LabelDao {
    List<Label> selectAllLabels();
}
