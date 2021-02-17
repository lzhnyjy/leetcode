package com.leetcode.service;

import com.leetcode.entity.Label;

import java.util.List;

/**
 * (Label)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:14:11
 */
public interface LabelService {

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    Label queryById(Integer labelid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Label> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param label 实例对象
     * @return 实例对象
     */
    Label insert(Label label);

    /**
     * 修改数据
     *
     * @param label 实例对象
     * @return 实例对象
     */
    Label update(Label label);

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer labelid);

}
