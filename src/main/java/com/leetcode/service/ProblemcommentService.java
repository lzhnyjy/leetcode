package com.leetcode.service;

import com.leetcode.entity.Problemcomment;
import com.leetcode.entity.dto.ProblemCommentLikeDTO;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.response.PageResult;

import java.util.List;

/**
 * (Problemcomment)表服务接口
 *
 * @author makejava
 * @since 2021-02-7 21:13:00
 */
public interface ProblemcommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param commentid 主键
     * @return 实例对象
     */
    Problemcomment queryById(Integer commentid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Problemcomment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param problemcomment 实例对象
     * @return 实例对象
     */
    Problemcomment insert(Problemcomment problemcomment);

    /**
     * 修改数据
     *
     * @param problemcomment 实例对象
     * @return 实例对象
     */
    Problemcomment update(Problemcomment problemcomment);

    /**
     * 通过主键删除数据
     *
     * @param commentid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer commentid);


    PageResult listCommentsByPage(Integer problemId, Integer sortedClass, Integer limit, Integer pages);

    RestInfo addLike(ProblemCommentLikeDTO dto);
}
