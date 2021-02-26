package com.leetcode.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用于封装返回给前端的结果
 *
 * @author protagonist
 * @title: StatusCode
 * @description: TODO
 * @date 2021-02-18 16:22:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private boolean flag;
    private Integer code;
    private String message;
    private T data;

    public Result(boolean flag, int code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
