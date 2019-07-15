package com.luokangtao.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * 启动类
 * @author luokangtao
 * @create 2019-07-14 21:55
 */
@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }

    //idWork分布式id
    @Bean
    public IdWorker idWorker(){
        //参数随便写
        return new IdWorker(1,1);
    }
}
