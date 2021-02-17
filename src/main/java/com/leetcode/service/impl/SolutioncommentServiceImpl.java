package com.leetcode.service.impl;

import com.leetcode.entity.Solutioncomment;
import com.leetcode.mapper.SolutioncommentDao;
import com.leetcode.service.SolutioncommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Solutioncomment)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:11:44
 */
@Service("solutioncommentService")
public class SolutioncommentServiceImpl implements SolutioncommentService {
    @Resource
    private SolutioncommentDao solutioncommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param commentid 主键
     * @return 实例对象
     */
    @Override
    public Solutioncomment queryById(Integer commentid) {
        return this.solutioncommentDao.queryById(commentid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Solutioncomment> queryAllByLimit(int offset, int limit) {
        return this.solutioncommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param solutioncomment 实例对象
     * @return 实例对象
     */
    @Override
    public Solutioncomment insert(Solutioncomment solutioncomment) {
        this.solutioncommentDao.insert(solutioncomment);
        return solutioncomment;
    }

    /**
     * 修改数据
     *
     * @param solutioncomment 实例对象
     * @return 实例对象
     */
    @Override
    public Solutioncomment update(Solutioncomment solutioncomment) {
        this.solutioncommentDao.update(solutioncomment);
        return this.queryById(solutioncomment.getCommentid());
    }

    /**
     * 通过主键删除数据
     *
     * @param commentid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer commentid) {
        return this.solutioncommentDao.deleteById(commentid) > 0;
    }
}
