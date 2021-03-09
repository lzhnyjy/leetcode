package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * (Exampleinfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:14:22
 */
@Repository
public interface ExampleinfoDao extends BaseMapper<Exampleinfo> {


   /* *//**
     * 通过ID查询单条数据
     *
     * @param exampleid 主键
     * @return 实例对象
     *//*
    Exampleinfo queryById(Integer exampleid);

    *//**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     *//*
    List<Exampleinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    *//**
     * 通过实体作为筛选条件查询
     *
     * @param exampleinfo 实例对象
     * @return 对象列表
     *//*
    List<Exampleinfo> queryAll(Exampleinfo exampleinfo);

    *//**
     * 新增数据
     *
     * @param exampleinfo 实例对象
     * @return 影响行数
     *//*
    int insert(Exampleinfo exampleinfo);

    *//**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exampleinfo> 实例对象列表
     * @return 影响行数
     *//*
    int insertBatch(@Param("entities") List<Exampleinfo> entities);

    *//**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Exampleinfo> 实例对象列表
     * @return 影响行数
     *//*
    int insertOrUpdateBatch(@Param("entities") List<Exampleinfo> entities);

    *//**
     * 修改数据
     *
     * @param exampleinfo 实例对象
     * @return 影响行数
     *//*
    int update(Exampleinfo exampleinfo);

    *//**
     * 通过主键删除数据
     *
     * @param exampleid 主键
     * @return 影响行数
     *//*
    int deleteById(Integer exampleid);*/

}

