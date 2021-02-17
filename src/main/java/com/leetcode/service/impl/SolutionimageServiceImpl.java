package com.leetcode.service.impl;

import com.leetcode.entity.Solutionimage;
import com.leetcode.mapper.SolutionimageDao;
import com.leetcode.service.SolutionimageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Solutionimage)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:11:33
 */
@Service("solutionimageService")
public class SolutionimageServiceImpl implements SolutionimageService {
    @Resource
    private SolutionimageDao solutionimageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param solutionimageid 主键
     * @return 实例对象
     */
    @Override
    public Solutionimage queryById(Integer solutionimageid) {
        return this.solutionimageDao.queryById(solutionimageid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Solutionimage> queryAllByLimit(int offset, int limit) {
        return this.solutionimageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param solutionimage 实例对象
     * @return 实例对象
     */
    @Override
    public Solutionimage insert(Solutionimage solutionimage) {
        this.solutionimageDao.insert(solutionimage);
        return solutionimage;
    }

    /**
     * 修改数据
     *
     * @param solutionimage 实例对象
     * @return 实例对象
     */
    @Override
    public Solutionimage update(Solutionimage solutionimage) {
        this.solutionimageDao.update(solutionimage);
        return this.queryById(solutionimage.getSolutionimageid());
    }

    /**
     * 通过主键删除数据
     *
     * @param solutionimageid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer solutionimageid) {
        return this.solutionimageDao.deleteById(solutionimageid) > 0;
    }
}
