package com.leetcode.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 封装分页的相关数据
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageListVo {

    private int total;
    private int currentPage;
    private int totalPage;
    private int limit;
    private List wonderfulComment;
    private List otherComment;

}
