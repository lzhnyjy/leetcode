package com.leetcode.service.impl;

import com.leetcode.mapper.LabelsolutionDao;
import com.leetcode.service.LabelsolutionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Labelsolution)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:13:49
 */
@Service("labelsolutionService")
public class LabelsolutionServiceImpl implements LabelsolutionService {
    @Resource
    private LabelsolutionDao labelsolutionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    @Override
    public Labelsolution queryById(Integer labelid) {
        return this.labelsolutionDao.queryById(labelid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Labelsolution> queryAllByLimit(int offset, int limit) {
        return this.labelsolutionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param labelsolution 实例对象
     * @return 实例对象
     */
    @Override
    public Labelsolution insert(Labelsolution labelsolution) {
        this.labelsolutionDao.insert(labelsolution);
        return labelsolution;
    }

    /**
     * 修改数据
     *
     * @param labelsolution 实例对象
     * @return 实例对象
     */
    @Override
    public Labelsolution update(Labelsolution labelsolution) {
        this.labelsolutionDao.update(labelsolution);
        return this.queryById(labelsolution.getLabelid());
    }

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer labelid) {
        return this.labelsolutionDao.deleteById(labelid) > 0;
    }
}
