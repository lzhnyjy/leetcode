package com.leetcode.service.impl;

import com.leetcode.mapper.ProblemdescDao;
import com.leetcode.service.ProblemdescService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Problemdesc)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:12:47
 */
@Service("problemdescService")
public class ProblemdescServiceImpl implements ProblemdescService {
    @Resource
    private ProblemdescDao problemdescDao;

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    @Override
    public Problemdesc queryById() {
        return this.problemdescDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Problemdesc> queryAllByLimit(int offset, int limit) {
        return this.problemdescDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param problemdesc 实例对象
     * @return 实例对象
     */
    @Override
    public Problemdesc insert(Problemdesc problemdesc) {
        this.problemdescDao.insert(problemdesc);
        return problemdesc;
    }

    /**
     * 修改数据
     *
     * @param problemdesc 实例对象
     * @return 实例对象
     */
    @Override
    public Problemdesc update(Problemdesc problemdesc) {
        this.problemdescDao.update(problemdesc);
        return this.queryById();
    }

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.problemdescDao.deleteById() > 0;
    }
}
