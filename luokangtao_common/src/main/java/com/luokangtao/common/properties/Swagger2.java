package com.luokangtao.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * swagger配置实体类
 * @author luokangtao
 * @create 2019-07-20 16:41
 */
@ConfigurationProperties(prefix = "swagger2")//定义一个实体类在装载配置文件信息
@Data
public class Swagger2 {
    private String title;//头部
    private String description;//描述
    private  String version;//版本号
    private String basePackage;//扫描的包
    private String contact;//作者

}
