package com.luokangtao.common.config;

import com.luokangtao.common.properties.Swagger2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2配置
 * @author luokangtao
 * @create 2019-07-15 17:19
 */
@Configuration  //@Configuration注解，表明它是一个配置类
@EnableSwagger2 //@EnableSwagger2开启swagger2。
@ConditionalOnProperty(prefix="swagger2",name = "enable", havingValue = "true")
@EnableConfigurationProperties(Swagger2.class)//@EnableConfigurationProperties注解的作用是：使使用 @ConfigurationProperties 注解的类生效。
public class Swagger2Config {

    @Bean
    public Docket controllerApi(Swagger2 swagger2) {
        return new Docket(DocumentationType.SWAGGER_2)
                //apiINfo()配置一些基本的信息。
                .apiInfo(new ApiInfoBuilder()
                        // 设置页面标题
                        .title(swagger2.getTitle())
                        //描述
                        .description(swagger2.getDescription())
                        //定义版本号
                        .version(swagger2.getVersion())
                        //作者
                        .contact(swagger2.getContact())
                        .build())
                .select()
                //apis()指定扫描的包会生成文档。
                .apis(RequestHandlerSelectors.basePackage(swagger2.getBasePackage()))
                .paths(PathSelectors.any())
                .build();
    }

}
