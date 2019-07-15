package com.luokangtao.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 标签查询条件
 * @author luokangtao
 * @create 2019-07-15 21:01
 */
@Data
@ApiModel("标签查询条件")
public class LableQueryCondition implements Serializable {
    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页",required = true)
    private Long current;
    /**
     * 当前页显示多少条数据
     */
    @ApiModelProperty(value = "当前页显示多少条数据",required = true)
    private Long size;

}
