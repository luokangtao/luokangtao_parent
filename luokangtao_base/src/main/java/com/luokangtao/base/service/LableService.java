package com.luokangtao.base.service;

import com.luokangtao.base.dao.LableDao;
import com.luokangtao.base.dto.LableQueryCondition;
import com.luokangtao.base.pojo.Lable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.luokangtao.common.util.IdWorker;

import java.util.List;
import java.util.Optional;

/**
 * 标签业务层
 * @author luokangtao
 * @create 2019-07-14 23:06
 */
@Service
@Slf4j //lombok 自带的日志
public class LableService {

    @Autowired
    private LableDao lableDao;//lable

    @Autowired
    private IdWorker idWorker;//分布式id

    /**
     * 新增标签
     * @param lable
     */
    @Transactional
    public void add(Lable lable) {
        //给lable设置主键id
        lable.setId(idWorker.nextId()+"");
        //调用jpa自带的方法  Hibernate: insert into tb_label (count, fans, labelname, recommend, state, id) values (?, ?, ?, ?, ?, ?)
        Lable save = lableDao.save(lable);
        //保存返回记录:[Lable(id=1150432376246112256, labelname=english, state=1, count=10, fans=100, recommend=1)]
        log.info("保存返回记录:[{}]",save);
    }

    /**
     * 分页查询所有的标签列表
     * @return
     * @param queryCondition
     */
    public List<Lable> findAll(LableQueryCondition queryCondition) {
        //调用jpa自带的方法
        List<Lable> list = lableDao.findAll();
        return list;
    }


    /**
     * 根据主键id查询
     * @param lableId
     * @return
     */
    public Lable findById(String lableId) {
        //获取包装之后Optional:[Optional[Lable(id=1150432376246112256, labelname=english, state=1, count=10, fans=100, recommend=1)]]
        Optional<Lable> byId = lableDao.findById(lableId);
        log.info("获取包装之后Optional:[{}]",byId);
        //获取结果集:[Lable(id=1150432376246112256, labelname=english, state=1, count=10, fans=100, recommend=1)]
        Lable lable = byId.get();
        log.info("获取结果集:[{}]",lable);
        return lable;
    }

    /**
     * 根据主键id修改
     * @param lableId
     * @param lable
     */
    @Transactional
    public void update(String lableId, Lable lable) {
        //保存前端传来的主键id
        lable.setId(lableId);
        //如果数据库有这个主键id就是修改  否则就是新增
        /**
         * Hibernate: select lable0_.id as id1_0_0_, lable0_.count as count2_0_0_, lable0_.fans as fans3_0_0_, lable0_.labelname as labelnam4_0_0_, lable0_.recommend as recommen5_0_0_, lable0_.state as state6_0_0_ from tb_label lable0_ where lable0_.id=?
         * Hibernate: update tb_label set count=?, fans=?, labelname=?, recommend=?, state=? where id=?
         */
        Lable save = lableDao.save(lable);
        log.info("新增后的数据:[{}]",save);
    }

    /**
     * 根据主键id删除
     * @param lableId
     */
    @Transactional
    public void delete(String lableId) {
//        //物理删除
//        lableDao.deleteById(lableId);
        //实际项目中一般都是逻辑删除 Hibernate: update tb_label t set t.state =? where t.id = ?
        int updateStatusById = lableDao.updateStatusById("0", lableId);
        log.info("逻辑删除后对象:[{}]",updateStatusById);
    }
}
