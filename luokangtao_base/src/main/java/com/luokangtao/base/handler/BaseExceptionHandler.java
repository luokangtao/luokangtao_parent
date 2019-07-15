package com.luokangtao.base.handler;

import com.luokangtao.common.entity.Result;
import com.luokangtao.common.entity.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理器
 * @author luokangtao
 * @create 2019-07-15 2:06
 */
@ControllerAdvice //@ControllerAdvice是controller的一个辅助类，最常用的就是作为全局异常处理的切面类
@Slf4j
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        log.info("异常信息:[{}]",e);
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }

}
