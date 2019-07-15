package com.luokangtao.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.luokangtao.common.util.IdWorker;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 * @author luokangtao
 * @create 2019-07-14 21:55
 */
@SpringBootApplication
@EnableSwagger2
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }

    //idWork分布式id
    @Bean
    public IdWorker idWorker(){
        //初始化参数随便写
        return new IdWorker(1,1);
    }
}
