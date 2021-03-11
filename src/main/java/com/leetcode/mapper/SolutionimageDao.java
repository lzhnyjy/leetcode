package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Solutionimage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Solutionimage)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:11:32
 */
@Repository
public interface SolutionimageDao extends BaseMapper<Solutionimage> {

    /**
     * 通过ID查询单条数据
     *
     * @param solutionimageid 主键
     * @return 实例对象
     */
    Solutionimage queryById(Integer solutionimageid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Solutionimage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param solutionimage 实例对象
     * @return 对象列表
     */
    List<Solutionimage> queryAll(Solutionimage solutionimage);

    /**
     * 新增数据
     *
     * @param solutionimage 实例对象
     * @return 影响行数
     */
    int insert(Solutionimage solutionimage);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Solutionimage> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Solutionimage> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Solutionimage> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Solutionimage> entities);

    /**
     * 修改数据
     *
     * @param solutionimage 实例对象
     * @return 影响行数
     */
    int update(Solutionimage solutionimage);

    /**
     * 通过主键删除数据
     *
     * @param solutionimageid 主键
     * @return 影响行数
     */
    int deleteById(Integer solutionimageid);

}

