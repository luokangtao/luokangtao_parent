//package com.luokangtao.common.config;
//
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * swagger2配置
// * @author luokangtao
// * @create 2019-07-15 17:19
// */
//@Configuration  //@Configuration注解，表明它是一个配置类
//@EnableSwagger2 //@EnableSwagger2开启swagger2。
//@Data
//@Slf4j
//public class Swagger2 {
//
//    @Value("${swagger2.title}")
//    private String title;
//
//    @Value("${swagger2.description}")
//    private String description;
//
//    @Value("${swagger2.version}")
//    private  String version;
//
//    @Value("${swagger2.basePackage}")
//    private String basePackage;
//
//    @Bean
//    public Docket controllerApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                //apiINfo()配置一些基本的信息。
//                .apiInfo(new ApiInfoBuilder()
//                        // 设置页面标题
//                        .title(title)
//                        //描述
//                        .description(description)
//                        //定义版本号
//                        .version(version)
//                        .build())
//                .select()
//                //apis()指定扫描的包会生成文档。
//                .apis(RequestHandlerSelectors.basePackage(basePackage))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//}
