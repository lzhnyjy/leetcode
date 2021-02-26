package com.leetcode.service.impl;/**
 * @Author lzh
 */

import com.leetcode.entity.Solution;
import com.leetcode.mapper.TestDao;
import com.leetcode.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Description //TODO
 * @Author lzh
 * @Date 2021/2/20 21:16
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Solution test() {
        Solution test = testDao.test(1);
        return test;
    }
}
