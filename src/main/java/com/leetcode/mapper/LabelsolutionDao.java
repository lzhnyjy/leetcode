package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Labelsolution;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Labelsolution)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:13:49
 */
@Repository
public interface LabelsolutionDao extends BaseMapper<Labelsolution> {

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    Labelsolution queryById(Integer labelid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Labelsolution> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param labelsolution 实例对象
     * @return 对象列表
     */
    List<Labelsolution> queryAll(Labelsolution labelsolution);

    /**
     * 新增数据
     *
     * @param labelsolution 实例对象
     * @return 影响行数
     */
    int insert(Labelsolution labelsolution);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Labelsolution> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Labelsolution> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Labelsolution> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Labelsolution> entities);

    /**
     * 修改数据
     *
     * @param labelsolution 实例对象
     * @return 影响行数
     */
    int update(Labelsolution labelsolution);

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 影响行数
     */
    int deleteById(Integer labelid);

}

