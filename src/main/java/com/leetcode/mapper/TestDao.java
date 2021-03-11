package com.leetcode.mapper;/**
 * @Author lzh
 */

import com.leetcode.entity.Solution;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName TestDao
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/20 21:17
 * @Version 1.0
 */
@Repository
public interface TestDao {

    public Solution test(@Param("id") Integer id);
}
