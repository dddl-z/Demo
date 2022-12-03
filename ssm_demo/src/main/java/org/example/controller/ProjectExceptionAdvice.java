package org.example.controller;

import org.example.exception.BusinessException;
import org.example.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    // 系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员，ex对象发送给开发人员
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    // 业务异常
    @ExceptionHandler(BusinessException.class)
    public Result d0BusinessException(BusinessException ex) {
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    // 其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员，ex对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙，请稍后再试！");
    }
}