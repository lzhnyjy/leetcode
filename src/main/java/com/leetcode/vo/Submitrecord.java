package com.leetcode.vo;

import java.util.Date;

public class Submitrecord {

    private Integer userId;
    private Integer problemId;
    private Date submitDateTime;
    private Integer submitResult;
    private String runResult;
    private String language;

    // 非数据库属性
    private String problemName;

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Date getSubmitDateTime() {
        return submitDateTime;
    }

    public void setSubmitDateTime(Date submitDateTime) {
        this.submitDateTime = submitDateTime;
    }

    public Integer getSubmitResult() {
        return submitResult;
    }

    public void setSubmitResult(Integer submitResult) {
        this.submitResult = submitResult;
    }

    public String getRunResult() {
        return runResult;
    }

    public void setRunResult(String runResult) {
        this.runResult = runResult;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
