package com.leetcode.entity;/**
 * @Author lzh
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;

/**
 * @ClassName SolutionComment
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/24 11:42
 * @Version 1.0
 */
@Data
@Alias("solutionComment")
@AllArgsConstructor
@NoArgsConstructor
public class SolutionComment {
    private Integer commentId;
    private Integer solutionId;
    private Integer parentId;
    private String commentContent;
    private Integer userId;
    private String username;
    private String image;
    private Date commentDatetime;
    private Integer commentLikeNumber;
    private List<SolutionComment> child;
}
