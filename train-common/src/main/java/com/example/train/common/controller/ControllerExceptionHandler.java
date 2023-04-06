package com.example.train.common.controller;

import com.example.train.common.resp.CommonResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理、数据预处理等，结合了前端统一封装的返回结果类，后端日志现实效果
 * @ControllerAdvice: 控制器增强，可以对controller进行统一的数据绑定、统一的异常处理、统一的数据预处理等
 * @author luf
 * @date 2023/04/06 13:55
 **/
@ControllerAdvice
public class ControllerExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * 所有异常统一处理
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResp exceptionHandler(Exception e) throws Exception {
        CommonResp commonResp = new CommonResp();
        //后端日志打印，方便排查问题
        LOG.error("系统异常：", e.getMessage());
        commonResp.setSuccess(false);
        // commonResp.setMessage("系统出现异常，请联系管理员");
        commonResp.setMessage(e.getMessage());
        return commonResp;
    }
}
