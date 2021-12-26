package com.gong.sample.webflux.handler;

import com.gong.sample.webflux.common.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    BaseResponse handleException(Exception e) {
        log.error(e.getMessage(), e);
        return BaseResponse.ofErrMsg("Exception...");
    }
}