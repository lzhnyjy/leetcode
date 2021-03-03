package com.leetcode.exception;

/**
 * 状态码类型编号 ，均为常量
 */
public class ExceptionCode {

    //操作成功
    public static final int SUCCESS = 200;
    //操作失败
    public static final int FAILED = 400;
    //token不存在
    public static  final int TOKEN_MISS = 421;
    //token过期
    public static final int TOKEN_EXPIRED=425;

    //文件操作失败
    public static final int FILE_ERROR=405;

}
