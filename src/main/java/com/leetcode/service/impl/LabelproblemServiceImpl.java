package com.leetcode.service.impl;

import com.leetcode.entity.Labelproblem;
import com.leetcode.mapper.LabelproblemDao;
import com.leetcode.service.LabelproblemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Labelproblem)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:14:01
 */
@Service("labelproblemService")
public class LabelproblemServiceImpl implements LabelproblemService {
    @Resource
    private LabelproblemDao labelproblemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    @Override
    public Labelproblem queryById(Integer labelid) {
        return this.labelproblemDao.queryById(labelid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Labelproblem> queryAllByLimit(int offset, int limit) {
        return this.labelproblemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param labelproblem 实例对象
     * @return 实例对象
     */
    @Override
    public Labelproblem insert(Labelproblem labelproblem) {
        this.labelproblemDao.insert(labelproblem);
        return labelproblem;
    }

    /**
     * 修改数据
     *
     * @param labelproblem 实例对象
     * @return 实例对象
     */
    @Override
    public Labelproblem update(Labelproblem labelproblem) {
        this.labelproblemDao.update(labelproblem);
        return this.queryById(labelproblem.getLabelid());
    }

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer labelid) {
        return this.labelproblemDao.deleteById(labelid) > 0;
    }
}
