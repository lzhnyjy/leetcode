package com.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetcode.entity.Solutioncomment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Solutioncomment)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-7 21:11:44
 */
@Repository
public interface SolutioncommentDao extends BaseMapper<Solutioncomment> {

    /**
     * 通过ID查询单条数据
     *
     * @param commentid 主键
     * @return 实例对象
     */
    Solutioncomment queryById(Integer commentid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Solutioncomment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param solutioncomment 实例对象
     * @return 对象列表
     */
    List<Solutioncomment> queryAll(Solutioncomment solutioncomment);

    /**
     * 新增数据
     *
     * @param solutioncomment 实例对象
     * @return 影响行数
     */
    int insert(Solutioncomment solutioncomment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Solutioncomment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Solutioncomment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Solutioncomment> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Solutioncomment> entities);

    /**
     * 修改数据
     *
     * @param solutioncomment 实例对象
     * @return 影响行数
     */
    int update(Solutioncomment solutioncomment);

    /**
     * 通过主键删除数据
     *
     * @param commentid 主键
     * @return 影响行数
     */
    int deleteById(Integer commentid);

}

