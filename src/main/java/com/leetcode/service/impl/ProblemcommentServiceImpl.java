package com.leetcode.service.impl;

import com.leetcode.entity.Problemcomment;
import com.leetcode.mapper.ProblemcommentDao;
import com.leetcode.service.ProblemcommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Problemcomment)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:13:00
 */
@Service("problemcommentService")
public class ProblemcommentServiceImpl implements ProblemcommentService {
    @Resource
    private ProblemcommentDao problemcommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param commentid 主键
     * @return 实例对象
     */
    @Override
    public Problemcomment queryById(Integer commentid) {
        return this.problemcommentDao.queryById(commentid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Problemcomment> queryAllByLimit(int offset, int limit) {
        return this.problemcommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param problemcomment 实例对象
     * @return 实例对象
     */
    @Override
    public Problemcomment insert(Problemcomment problemcomment) {
        this.problemcommentDao.insert(problemcomment);
        return problemcomment;
    }

    /**
     * 修改数据
     *
     * @param problemcomment 实例对象
     * @return 实例对象
     */
    @Override
    public Problemcomment update(Problemcomment problemcomment) {
        this.problemcommentDao.update(problemcomment);
        return this.queryById(problemcomment.getCommentid());
    }

    /**
     * 通过主键删除数据
     *
     * @param commentid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer commentid) {
        return this.problemcommentDao.deleteById(commentid) > 0;
    }
}
