package com.luokangtao.base.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotNull;
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
    @NotNull(message = "当前页不能为空")
    @ApiModelProperty(value = "当前页",required = true)
    private Integer current;
    /**
     * 当前页显示多少条数据
     */
    @NotNull(message = "当前页大小不能为空")
    @ApiModelProperty(value = "当前页显示多少条数据",required = true)
    private Integer size;

}
