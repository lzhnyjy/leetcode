package com.leetcode.service;

import java.util.List;

/**
 * (Labelsolution)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:13:49
 */
public interface LabelsolutionService {

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    Labelsolution queryById(Integer labelid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Labelsolution> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param labelsolution 实例对象
     * @return 实例对象
     */
    Labelsolution insert(Labelsolution labelsolution);

    /**
     * 修改数据
     *
     * @param labelsolution 实例对象
     * @return 实例对象
     */
    Labelsolution update(Labelsolution labelsolution);

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer labelid);

}
