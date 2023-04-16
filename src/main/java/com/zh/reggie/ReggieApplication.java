package com.zh.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zh
 * @create 2023-04-10-10:30
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class ReggieApplication {
    public static void main(String[] args) {

        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功。。");
    }
}
