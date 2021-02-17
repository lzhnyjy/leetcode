package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Problemdesc;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Problemdesc)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-1 21:12:46
 */
@Repository
public interface ProblemdescDao extends BaseMapper<Problemdesc> {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Problemdesc queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Problemdesc> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param problemdesc 实例对象
     * @return 对象列表
     */
    List<Problemdesc> queryAll(Problemdesc problemdesc);

    /**
     * 新增数据
     *
     * @param problemdesc 实例对象
     * @return 影响行数
     */
    int insert(Problemdesc problemdesc);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Problemdesc> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Problemdesc> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Problemdesc> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Problemdesc> entities);

    /**
     * 修改数据
     *
     * @param problemdesc 实例对象
     * @return 影响行数
     */
    int update(Problemdesc problemdesc);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 影响行数
     */
    int deleteById();

}

