package com.zh.reggie.common;

/**
 * @author zh
 * @create 2023-04-12-15:07
 */
public class CustomerExpection extends RuntimeException{
    public CustomerExpection(String message){
        super(message);
    }
}
