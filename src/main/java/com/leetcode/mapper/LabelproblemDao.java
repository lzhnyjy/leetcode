package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Labelproblem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Labelproblem)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:14:01
 */
@Repository
public interface LabelproblemDao extends BaseMapper<Labelproblem> {

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    Labelproblem queryById(Integer labelid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Labelproblem> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param labelproblem 实例对象
     * @return 对象列表
     */
    List<Labelproblem> queryAll(Labelproblem labelproblem);

    /**
     * 新增数据
     *
     * @param labelproblem 实例对象
     * @return 影响行数
     */
    int insert(Labelproblem labelproblem);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Labelproblem> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Labelproblem> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Labelproblem> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Labelproblem> entities);

    /**
     * 修改数据
     *
     * @param labelproblem 实例对象
     * @return 影响行数
     */
    int update(Labelproblem labelproblem);

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 影响行数
     */
    int deleteById(Integer labelid);

}

