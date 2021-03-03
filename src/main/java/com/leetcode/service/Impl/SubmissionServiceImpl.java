package com.leetcode.service.Impl;


import com.leetcode.entity.dto.SubmitMessageDto;
import com.leetcode.entity.dto.SubmitRecordDto;
import com.leetcode.entity.vo.RestInfo;
import com.leetcode.entity.vo.SubmitMessageVo;
import com.leetcode.entity.vo.SubmitVo;
import com.leetcode.exception.CompileFileException;
import com.leetcode.mapper.SubmissionMapper;
import com.leetcode.service.SubmissionService;
import com.leetcode.util.CaculateConsumeUtile;
import com.leetcode.util.FileCompileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class SubmissionServiceImpl implements SubmissionService {


    @Autowired
    SubmissionMapper submissionMapper;

    /**
     * 查询用户提交记录
     * @param userId
     * @param problemId
     * @return
     */
    @Override
    public RestInfo querySubmissionsById(Integer userId, int problemId) {
        List<SubmitMessageVo> submitMessageVoList = submissionMapper.querySubmitMessageById(userId, problemId);
        String runResult = submissionMapper.queryRunResult(userId, problemId);
        SubmitVo submitVo = new SubmitVo();
        submitVo.setSubmitMessageVoList(submitMessageVoList);
        submitVo.setRunResult(runResult);
        if (submitMessageVoList==null){
            return RestInfo.success("您还没做过这道题哦！是不是已经迫不及待想要尝试一下",submitVo);
        }
        return RestInfo.success(submitVo);
    }

    /**
     * 编译用户发来的数据
     * @param submitMessageDto
     * @return
     */
    @Override
    public RestInfo compileCode(SubmitMessageDto submitMessageDto) throws CompileFileException {
        //项目地址
        String filePath = "E:\\com.leetcode\\";
        String codeMessage = submitMessageDto.getCodeMessage();
        FileCompileUtil fileCompileUtil = new FileCompileUtil();

        //获得编译时间和内存消耗
        CaculateConsumeUtile caculateConsumeUtile = new CaculateConsumeUtile();

        caculateConsumeUtile.start();

        List<Object> runResultList;
        //得到编译运行之后的结果
        try {
            runResultList = fileCompileUtil.exec(codeMessage, filePath);
        } catch (IOException e) {
            throw new CompileFileException("编译失败！");
        }
        if (runResultList==null){
            return RestInfo.failed("编译文件操作失败！");
        }

        List<String> runMsg = caculateConsumeUtile.end();

        SubmitRecordDto submitRecordDto = new SubmitRecordDto();
        submitRecordDto.setUserId(submitMessageDto.getUserId());
        submitRecordDto.setProblemId(submitMessageDto.getProblemId());

        //获取当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = df.format(new Date());
        submitRecordDto.setSubmitDateTime(currentTime);

        submitRecordDto.setSubmitResult((int) runResultList.get(1));
        submitRecordDto.setRunResult((String) runResultList.get(0));

        submitRecordDto.setRunTime(runMsg.get(0));
        submitRecordDto.setUseCpu(runMsg.get(1));
        submitRecordDto.setLanguage("java");

        submissionMapper.submitCode(submitRecordDto);

        return RestInfo.success(runResultList);
    }


}
