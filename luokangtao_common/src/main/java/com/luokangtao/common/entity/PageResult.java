package com.luokangtao.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 分页数据封装的实体类
 * @author luokangtao
 * @create 2019-07-14 21:24
 */
@Data
@ApiModel("分页数据封装的实体类")
@Accessors(chain = true)
public class PageResult<T>  implements Serializable {
    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页")
    private Integer current;
    /**
     * 当前页显示多少条数据
     */
    @ApiModelProperty(value = "当前页显示多少条数据")
    private Integer size;
    /**
     * 总条数
     */
    @ApiModelProperty(value = "总条数")
    private Long total;
    /**
     * 当前页显示的数据
     */
    @ApiModelProperty(value = "当前页显示的数据")
    private List<T> rows;
}
