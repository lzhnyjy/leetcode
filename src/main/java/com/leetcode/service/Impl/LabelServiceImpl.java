
package com.leetcode.service.impl;


import com.leetcode.entity.Label;
import com.leetcode.mapper.LabelDao;
import com.leetcode.service.LabelService;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName LabelServiceImpl
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/25 11:48
 * @Version 1.0
 */
@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    private LabelDao labelDao;

    @Override
    public List<Label> selectAllLabels() {
        List<Label> labels = labelDao.selectAllLabels();
        return labels;
    }
}
