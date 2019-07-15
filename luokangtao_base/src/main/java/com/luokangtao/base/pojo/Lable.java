package com.luokangtao.base.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 标签实体类
 * @author luokangtao
 * @create 2019-07-14 22:07
 */
@Entity  //代表此类为一个表的映射entity类
@Table(name="tb_label") //设置对应的表名
@Data //@Data注解中包含了get，set和toString
@Accessors(chain = true) //开启链写编程
public class Lable implements Serializable {
    /**
     * CREATE TABLE `tb_label` (
     *   `id` VARCHAR(20) NOT NULL COMMENT '标签ID',
     *   `labelname` VARCHAR(100) DEFAULT NULL COMMENT '标签名称',
     *   `state` VARCHAR(1) DEFAULT NULL COMMENT '状态  0:无效 1:有效',
     *   `count` BIGINT(20) DEFAULT NULL COMMENT '使用数量',
     *   `recommend` VARCHAR(1) DEFAULT NULL COMMENT '是否推荐 0:不推荐 1:推荐',
     *   `fans` BIGINT(20) DEFAULT NULL COMMENT '粉丝数',
     *   PRIMARY KEY (`id`)
     * ) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='标签';
     */

    @Id //此备注代表该字段为该类的主键
    private String id;//主键id
    private String labelname;//标签名称
    private String state;//状态
    private Long count;//使用数量
    private Long fans;//关注数
    private String recommend;//是否推荐
}
