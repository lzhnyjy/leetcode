package com.leetcode.service.impl;

import com.leetcode.entity.Problem;
import com.leetcode.mapper.ProblemDao;
import com.leetcode.service.ProblemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Problem)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:13:30
 */
@Service("problemService")
public class ProblemServiceImpl implements ProblemService {
    @Resource
    private ProblemDao problemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param problemid 主键
     * @return 实例对象
     */
    @Override
    public Problem queryById(Integer problemid) {
        return this.problemDao.queryById(problemid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Problem> queryAllByLimit(int offset, int limit) {
        return this.problemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param problem 实例对象
     * @return 实例对象
     */
    @Override
    public Problem insert(Problem problem) {
        this.problemDao.insert(problem);
        return problem;
    }

    /**
     * 修改数据
     *
     * @param problem 实例对象
     * @return 实例对象
     */
    @Override
    public Problem update(Problem problem) {
        this.problemDao.update(problem);
        return this.queryById(problem.getProblemid());
    }

    /**
     * 通过主键删除数据
     *
     * @param problemid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer problemid) {
        return this.problemDao.deleteById(problemid) > 0;
    }
}
