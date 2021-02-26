package com.leetcode.service.impl;/**
 * @Author lzh
 */

import com.leetcode.entity.SolutionComment;
import com.leetcode.mapper.SolutionCommentDao;
import com.leetcode.service.SolutionCommentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName SolutionCommentServiceImpl
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/24 12:05
 * @Version 1.0
 */
@Service
public class SolutionCommentServiceImpl implements SolutionCommentService {

    @Autowired
    private SolutionCommentDao solutionCommentDao;

    @Override
    public List<SolutionComment> selectCommentBySolutionId(Integer solutionId) {

        List<SolutionComment> allComments = solutionCommentDao.selectCommentBySolutionId(solutionId);
        Map<Integer,SolutionComment>map=new HashMap<>();
        List<SolutionComment> result=new ArrayList<>();
        for (SolutionComment comment : allComments) {
            if(comment.getParentId()==null){
                result.add(comment);
            }
            map.put(comment.getCommentId(), comment);
        }
        for (SolutionComment comment : allComments) {
            if(comment.getParentId()!=null){
                SolutionComment parent = map.get(comment.getParentId());
                if(parent.getChild()==null){
                    parent.setChild(new ArrayList<>());
                }
                parent.getChild().add(comment);
            }
        }

        return result;
    }


    @Override
    public Integer addSolutionComment(SolutionComment solutionComment){
        Integer integer = solutionCommentDao.addSolutionComment(solutionComment);
        return integer;
    }

    /**
     * @Author lzh
     * @Description //TODO 查询单一评论
     * @Date 10:47 2021/2/25
     * @Param [solutionId, commentId]
     * @return com.leetcode.entity.SolutionComment
     **/
    @Override
    public SolutionComment selectOneComment(Integer solutionId,Integer commentId) {
        List<SolutionComment> allComments = solutionCommentDao.selectCommentBySolutionId(solutionId);
        Map<Integer,SolutionComment> map=new HashMap<>();
        Map<Integer,SolutionComment> resultMap=new HashMap<>();
        for (SolutionComment comment : allComments) {
            if(comment.getParentId()==null){
                resultMap.put(comment.getCommentId(), comment);
            }
            map.put(comment.getCommentId(), comment);
        }
        for (SolutionComment comment : allComments) {
            if(comment.getParentId()!=null){
                SolutionComment parent = map.get(comment.getParentId());
                if(parent.getChild()==null){
                    parent.setChild(new ArrayList<>());
                }
                parent.getChild().add(comment);
            }
        }
        SolutionComment comment = resultMap.get(commentId);
        return comment;
    }

    @Override
    public Integer selectTopMostCommentId(Integer parentId) {

        SolutionComment comment = solutionCommentDao.selectTopMostCommentId(parentId);
        if(comment.getParentId()!=null){
            SolutionComment comment1 = solutionCommentDao.selectTopMostCommentId(comment.getParentId());
            return comment1.getCommentId();
        }
        return comment.getCommentId();
    }

}
