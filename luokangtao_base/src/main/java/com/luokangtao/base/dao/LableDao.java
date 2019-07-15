package com.luokangtao.base.dao;

import com.luokangtao.base.pojo.Lable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * 标签的dao
 * JpaRepository<实体类,数据库的主键ID类型>  提供了基本的增删改查
 * JpaSpecificationExecutor<实体类>  用于做复杂的条件查询
 * @author luokangtao
 * @create 2019-07-14 23:12
 */
public interface LableDao extends JpaRepository<Lable,String> , JpaSpecificationExecutor<Lable> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update tb_label t set t.state =?1 where t.id = ?2",nativeQuery = true)
    int updateStatusById( String state,  String id);

}
