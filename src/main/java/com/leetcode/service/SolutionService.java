package com.leetcode.service;

import com.leetcode.entity.Solution;

import java.util.List;

/**
 * (Solution)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:12:36
 */
public interface SolutionService {

    /**
     * 通过ID查询单条数据
     *
     * @param solutionid 主键
     * @return 实例对象
     */
    Solution queryById(Integer solutionid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Solution> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param solution 实例对象
     * @return 实例对象
     */
    Solution insert(Solution solution);

    /**
     * 修改数据
     *
     * @param solution 实例对象
     * @return 实例对象
     */
    Solution update(Solution solution);

    /**
     * 通过主键删除数据
     *
     * @param solutionid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer solutionid);

}
