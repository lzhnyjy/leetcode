package com.leetcode.service;

import com.leetcode.entity.Solutionimage;

import java.util.List;

/**
 * (Solutionimage)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:11:33
 */
public interface SolutionimageService {

    /**
     * 通过ID查询单条数据
     *
     * @param solutionimageid 主键
     * @return 实例对象
     */
    Solutionimage queryById(Integer solutionimageid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Solutionimage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param solutionimage 实例对象
     * @return 实例对象
     */
    Solutionimage insert(Solutionimage solutionimage);

    /**
     * 修改数据
     *
     * @param solutionimage 实例对象
     * @return 实例对象
     */
    Solutionimage update(Solutionimage solutionimage);

    /**
     * 通过主键删除数据
     *
     * @param solutionimageid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer solutionimageid);

}
