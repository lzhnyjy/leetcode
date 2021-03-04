package com.leetcode.mapper;

import com.leetcode.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void add(User user);

    void delete(Integer id);

    void update(User user);

    User getById(Integer id);

    User getByPhone(String phone);

    User getByUsername(String username);

    User getByEmail(String email);

}
