package com.leetcode.service.impl;

import com.leetcode.entity.Label;
import com.leetcode.mapper.LabelDao;
import com.leetcode.service.LabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Label)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:14:11
 */
@Service("labelService")
public class LabelServiceImpl implements LabelService {
    @Resource
    private LabelDao labelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param labelid 主键
     * @return 实例对象
     */
    @Override
    public Label queryById(Integer labelid) {
        return this.labelDao.queryById(labelid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Label> queryAllByLimit(int offset, int limit) {
        return this.labelDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param label 实例对象
     * @return 实例对象
     */
    @Override
    public Label insert(Label label) {
        this.labelDao.insert(label);
        return label;
    }

    /**
     * 修改数据
     *
     * @param label 实例对象
     * @return 实例对象
     */
    @Override
    public Label update(Label label) {
        this.labelDao.update(label);
        return this.queryById(label.getLabelid());
    }

    /**
     * 通过主键删除数据
     *
     * @param labelid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer labelid) {
        return this.labelDao.deleteById(labelid) > 0;
    }
}
