package com.leetcode.service;

import java.util.List;

/**
 * (Labelproblem)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:14:01
 */
public interface LabelproblemService {

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    Labelproblem queryById(Integer labelid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Labelproblem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param labelproblem 实例对象
     * @return 实例对象
     */
    Labelproblem insert(Labelproblem labelproblem);

    /**
     * 修改数据
     *
     * @param labelproblem 实例对象
     * @return 实例对象
     */
    Labelproblem update(Labelproblem labelproblem);

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer labelid);

}
