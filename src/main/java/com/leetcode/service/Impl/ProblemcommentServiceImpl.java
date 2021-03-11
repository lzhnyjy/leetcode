package com.leetcode.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leetcode.entity.ProblemCommentLike;
import com.leetcode.entity.Problemcomment;
import com.leetcode.entity.dto.ProblemCommentLikeDTO;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.mapper.ProblemcommentDao;
import com.leetcode.mapper.ProblemcommentlikeDao;
import com.leetcode.response.PageResult;
import com.leetcode.service.ProblemcommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ProblemcommentServiceImpl extends ServiceImpl<ProblemcommentDao, Problemcomment> implements ProblemcommentService {
    @Resource
    private ProblemcommentDao problemcommentDao;
    @Autowired
    private ProblemcommentlikeDao problemcommentlikeDao;

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

    @Override
    public PageResult listCommentsByPage(Integer problemId, Integer sortedClass, Integer limit, Integer pages) {
        Page<Problemcomment> page = new Page<>(pages, limit);
        QueryWrapper<Problemcomment> queryWrapper = new QueryWrapper<>();
        if (sortedClass == 1) {
            queryWrapper.lambda().eq(Problemcomment::getProblemid, problemId).orderByDesc(Problemcomment::getCommentlikenumber);
        } else if (sortedClass == 2) {
            queryWrapper.lambda().eq(Problemcomment::getProblemid, problemId).orderByDesc(Problemcomment::getCommentdatetime);
        } else if (sortedClass == 3) {
            queryWrapper.lambda().eq(Problemcomment::getProblemid, problemId).orderByAsc(Problemcomment::getCommentdatetime);
        }
        IPage<Problemcomment> iPage = this.baseMapper.selectPage(page, queryWrapper);
        return new PageResult(iPage.getTotal(), iPage.getRecords());
    }

    @Override
    public RestInfo addLike(ProblemCommentLikeDTO dto) {
        QueryWrapper<ProblemCommentLike> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ProblemCommentLike::getCommentId, dto.getCommentId());
        ProblemCommentLike commentLike = problemcommentlikeDao.selectOne(queryWrapper);
        if (commentLike == null) {
            commentLike = new ProblemCommentLike();
            BeanUtils.copyProperties(dto, commentLike);
            problemcommentlikeDao.insert(commentLike);
            queryWrapper.lambda().eq(ProblemCommentLike::getLikeStatus, 1);
            Integer likeNumber = problemcommentlikeDao.selectCount(queryWrapper);
            return new RestInfo(likeNumber);
        } else {
            commentLike.setLikeStatus(1);
            problemcommentlikeDao.updateById(commentLike);
            queryWrapper.lambda().eq(ProblemCommentLike::getLikeStatus, 1);
            Integer likeNumber = problemcommentlikeDao.selectCount(queryWrapper);
            return new RestInfo(likeNumber);
        }
    }
}
