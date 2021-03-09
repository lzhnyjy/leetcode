package com.leetcode.service.impl;

import com.leetcode.mapper.ExampleinfoDao;
import com.leetcode.service.ExampleinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Exampleinfo)表服务实现类
 *
 * @author makejava
 * @since 2021-02-7 21:14:22
 */
@Service("exampleinfoService")
public class ExampleinfoServiceImpl implements ExampleinfoService {
    @Resource
    private ExampleinfoDao exampleinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param exampleid 主键
     * @return 实例对象
     */
 /*   @Override
    public Exampleinfo queryById(Integer exampleid) {
        return this.exampleinfoDao.queryById(exampleid);
    }*/

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
 /*   @Override
    public List<Exampleinfo> queryAllByLimit(int offset, int limit) {
        return this.exampleinfoDao.queryAllByLimit(offset, limit);
    }*/

    @Override
    public Exampleinfo queryById(Integer exampleid) {
        return null;
    }

    @Override
    public List<Exampleinfo> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param exampleinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Exampleinfo insert(Exampleinfo exampleinfo) {
        this.exampleinfoDao.insert(exampleinfo);
        return exampleinfo;
    }

    @Override
    public Exampleinfo update(Exampleinfo exampleinfo) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param exampleinfo 实例对象
     * @return 实例对象
     */
 /*   @Override
    public Exampleinfo update(Exampleinfo exampleinfo) {
        this.exampleinfoDao.update(exampleinfo);
        return this.queryById(exampleinfo.getExampleid());
    }*/

    /**
     * 通过主键删除数据
     *
     * @param exampleid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer exampleid) {
        return this.exampleinfoDao.deleteById(exampleid) > 0;
    }
}
