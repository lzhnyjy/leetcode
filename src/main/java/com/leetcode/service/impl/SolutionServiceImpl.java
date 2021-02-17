package com.leetcode.service.impl;

import com.leetcode.entity.Solution;
import com.leetcode.mapper.SolutionDao;
import com.leetcode.service.SolutionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Solution)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:12:36
 */
@Service("solutionService")
public class SolutionServiceImpl implements SolutionService {
    @Resource
    private SolutionDao solutionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param solutionid 主键
     * @return 实例对象
     */
    @Override
    public Solution queryById(Integer solutionid) {
        return this.solutionDao.queryById(solutionid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Solution> queryAllByLimit(int offset, int limit) {
        return this.solutionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param solution 实例对象
     * @return 实例对象
     */
    @Override
    public Solution insert(Solution solution) {
        this.solutionDao.insert(solution);
        return solution;
    }

    /**
     * 修改数据
     *
     * @param solution 实例对象
     * @return 实例对象
     */
    @Override
    public Solution update(Solution solution) {
        this.solutionDao.update(solution);
        return this.queryById(solution.getSolutionid());
    }

    /**
     * 通过主键删除数据
     *
     * @param solutionid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer solutionid) {
        return this.solutionDao.deleteById(solutionid) > 0;
    }
}
