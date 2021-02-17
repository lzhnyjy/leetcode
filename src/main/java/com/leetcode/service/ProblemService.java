package com.leetcode.service;

import com.leetcode.entity.Problem;

import java.util.List;

/**
 * (Problem)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:13:30
 */
public interface ProblemService {

    /**
     * 通过ID查询单条数据
     *
     * @param problemid 主键
     * @return 实例对象
     */
    Problem queryById(Integer problemid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Problem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param problem 实例对象
     * @return 实例对象
     */
    Problem insert(Problem problem);

    /**
     * 修改数据
     *
     * @param problem 实例对象
     * @return 实例对象
     */
    Problem update(Problem problem);

    /**
     * 通过主键删除数据
     *
     * @param problemid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer problemid);

}
