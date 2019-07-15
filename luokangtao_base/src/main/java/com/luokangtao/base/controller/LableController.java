package com.luokangtao.base.controller;

import com.luokangtao.base.pojo.Lable;
import com.luokangtao.base.service.LableService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 标签控制层
 * @author luokangtao
 * @create 2019-07-14 23:01
 */
@RestController
@RequestMapping("/lable")
public class LableController {

    @Autowired
    private LableService lableService;


    /**
     * 分页查询所有的标签列表
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Lable lable){
        lableService.add(lable);
        return new Result(true, StatusCode.OK,"新增成功");
    }

    /**
     * 分页查询所有的标签列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        List<Lable> lableList = lableService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",lableList);
    }

    /**
     * 根据主键id查询
     * @return
     */
    @RequestMapping(value = "/{lableId}",method = RequestMethod.GET)
    public Result findById(@PathVariable("lableId")String lableId){
        Lable lable = lableService.findById(lableId);
        return new Result(true, StatusCode.OK,"查询成功",lable);
    }

    /**
     * 根据主键id修改
     * @return
     */
    @RequestMapping(value = "/{lableId}",method = RequestMethod.PUT)
    public Result update(@PathVariable("lableId")String lableId,@RequestBody Lable lable){
        lableService.update(lableId,lable);
        return new Result(true, StatusCode.OK,"修改成功");
    }

    /**
     * 根据主键id删除
     * @return
     */
    @RequestMapping(value = "/{lableId}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("lableId")String lableId){
        lableService.delete(lableId);
        return new Result(true, StatusCode.OK,"删除成功");
    }
}
