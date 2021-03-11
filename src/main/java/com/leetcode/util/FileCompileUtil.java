package com.leetcode.util;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 调用代码编译运行的工具类
 */
public class FileCompileUtil {
    StringToolUtil toolUtil = new StringToolUtil();

    //path项目路径
    public List<Object> exec(String codeMessage, String path) throws IOException {
        //运行结果
        int submitResult = 1;
        //编译信息
        String msg = null;
        //返回结果
        List<Object> result = new ArrayList<>();

        //文件名
        String filename = toolUtil.subString(codeMessage, "class", "{").trim();

        //1.建立源文件
        File file = new File(path + filename + ".java");

        //2.保存到hello.java文件中
        OutputStream out = new FileOutputStream(file);
        out.write(codeMessage.getBytes());
        out.close();

        //3.读取javac进程来编译hello.java
        String command = "javac "+filename+".java";
        Process javacProcess = Runtime.getRuntime().exec(command);

        //4.读取javac进程中的错误流信息
        InputStream error = javacProcess.getErrorStream();
        //5. 读取流中的数据
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = error.read(buffer)) != -1) {
            msg = new String(buffer, 0, len, "GBK");
        }

        //编译出错
        if (msg != null) {
            submitResult = 0;
            result.add(msg);
            result.add(submitResult);
            return result;
        }
        error.close();


        //6.调用java进程来运行hello.class
        Process javaProcess = Runtime.getRuntime().exec("java "+filename);
        //7.读取进程中的错误流信息
        InputStream info = javaProcess.getErrorStream();
        while ((len = info.read(buffer)) != -1) {
            msg = new String(buffer, 0, len);
        }

        //运行成功！
        if (msg == null) {
            info = javaProcess.getInputStream();
            while ((len = info.read(buffer)) != -1) {
                msg = new String(buffer, 0, len);
            }
            submitResult = 2;
            result.add(msg);
            result.add(submitResult);
            return result;
        }
        result.add(msg);
        result.add(submitResult);
        info.close();
        //8.删除java和class文件
        file.delete();
        return result;
    }
}
