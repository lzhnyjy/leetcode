package com.leetcode.entity.vo;

import com.leetcode.exception.ExceptionCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 每次操作需要返回的参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestInfo {

    private int code;
    private String message;
    private Object data;


    public RestInfo(Object data) {
        this.code = ExceptionCode.SUCCESS;
        this.message = "success";
        this.data = data;
    }

    public static RestInfo success() {
        return new RestInfo(null);
    }

    public static RestInfo success(Object data) {
        return new RestInfo(data);
    }

    public static RestInfo success(String message, Object data) {
        return new RestInfo(ExceptionCode.SUCCESS, message, data);
    }

    public static RestInfo failed() {
        return new RestInfo(ExceptionCode.FAILED, null, null);
    }

    public static RestInfo failed(String message) {
        return new RestInfo(ExceptionCode.FAILED, message, null);
    }

    public static RestInfo failed(int code, String message) {
        return new RestInfo(code, message, null);
    }

    public static RestInfo failed(int code, String message, Object data) {
        return new RestInfo(code, message, data);
    }
}
