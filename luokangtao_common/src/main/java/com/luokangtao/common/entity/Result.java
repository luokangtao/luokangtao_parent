package com.luokangtao.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应结果的实体类
 * @author luokangtao
 * @create 2019-07-14 21:02
 */
@Data //@Data注解中包含了get，set和toString
@Accessors(chain = true) //开启链写编程
@ApiModel("响应结果的实体类")
public class Result<T> implements Serializable {
    /**
     * 响应状态
     */
    @ApiModelProperty(value = "响应状态")
    private boolean flag;
    /**
     * 返回码
     */
    @ApiModelProperty(value = "返回码")
    private Integer code;
    /**
     * 响应信息
     */
    @ApiModelProperty(value = "响应信息")
    private String message;
    /**
     * 返回数据
     */
    @ApiModelProperty(value = "返回数据")
    private T data;

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
