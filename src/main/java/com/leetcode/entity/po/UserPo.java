package com.leetcode.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应数据库的用户表user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPo {

    private Integer userId;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String image;

}
