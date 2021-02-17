package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Label;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Label)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:14:11
 */
@Repository
public interface LabelDao extends BaseMapper<Label> {

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    Label queryById(Integer labelid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Label> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param label 实例对象
     * @return 对象列表
     */
    List<Label> queryAll(Label label);

    /**
     * 新增数据
     *
     * @param label 实例对象
     * @return 影响行数
     */
    int insert(Label label);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Label> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Label> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Label> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Label> entities);

    /**
     * 修改数据
     *
     * @param label 实例对象
     * @return 影响行数
     */
    int update(Label label);

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 影响行数
     */
    int deleteById(Integer labelid);

}

