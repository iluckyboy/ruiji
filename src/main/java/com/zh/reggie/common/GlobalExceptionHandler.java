package com.zh.reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author zh
 * @create 2023-04-11-13:47
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> exceptionHandler(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage());
        if(ex.getMessage().contains("Duplicate entry")){

            String msg = "账号已存在";
            return R.error(msg);
        }
        return R.error("未知错误");

    }

    @ExceptionHandler(CustomerExpection.class)
    public R<String> exceptionHandler(CustomerExpection ex){

        return R.error(ex.getMessage());

    }
}
