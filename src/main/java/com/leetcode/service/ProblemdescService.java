package com.leetcode.service;

import java.util.List;

/**
 * (Problemdesc)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:12:47
 */
public interface ProblemdescService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Problemdesc queryById();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Problemdesc> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param problemdesc 实例对象
     * @return 实例对象
     */
    Problemdesc insert(Problemdesc problemdesc);

    /**
     * 修改数据
     *
     * @param problemdesc 实例对象
     * @return 实例对象
     */
    Problemdesc update(Problemdesc problemdesc);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    boolean deleteById();

}
