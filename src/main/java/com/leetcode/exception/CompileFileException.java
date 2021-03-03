package com.leetcode.exception;

public class CompileFileException extends RecruitException {

    public CompileFileException() {
        super(ExceptionCode.FILE_ERROR, "编译操作失败！");
    }

    public CompileFileException(String message) {
        super(ExceptionCode.FILE_ERROR, message);
    }

    public CompileFileException(int code,String message){
        super(code,message);
    }
}
