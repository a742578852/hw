package com.information.five.execption;

import com.information.five.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常捕获类
 */
@RestControllerAdvice
public class CustomExtHandler {

    private static  final Logger LOG = LoggerFactory.getLogger(CustomExtHandler.class);

    @ExceptionHandler(value = Exception.class)
    Object handleException(Exception e, HttpServletRequest request ){

        return new Result<>(100,false,e.getMessage(),request.getRequestURI());

    }
}
