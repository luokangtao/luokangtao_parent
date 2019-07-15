package com.luokangtao.base.controller;

import com.luokangtao.base.pojo.Lable;
import com.luokangtao.base.service.LableService;
import com.luokangtao.common.entity.Result;
import com.luokangtao.common.entity.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "标签接口",tags = "标签接口大全")
public class LableController {

    @Autowired
    private LableService lableService;


    /**
     * 新增标签
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "新增标签")
    public Result add(@RequestBody Lable lable){
        lableService.add(lable);
        return new Result(true, StatusCode.OK,"新增成功");
    }

    /**
     * 根据主键id修改
     * @return
     */
    @RequestMapping(value = "/{lableId}",method = RequestMethod.PUT)
    @ApiOperation(value = "根据主键id修改")
    public Result update(@PathVariable("lableId")String lableId,@RequestBody Lable lable){
        lableService.update(lableId,lable);
        return new Result(true, StatusCode.OK,"修改成功");
    }


    /**
     * 分页查询标签列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "分页查询标签列表")
    public Result<List<Lable>> findAll(){
        List<Lable> lableList = lableService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",lableList);
    }

    /**
     * 根据主键id查询
     * @return
     */
    @RequestMapping(value = "/{lableId}",method = RequestMethod.GET)
    @ApiOperation(value = "根据主键id查询")
    public Result<Lable> findById(@PathVariable("lableId")String lableId){
        Lable lable = lableService.findById(lableId);
        return new Result(true, StatusCode.OK,"查询成功",lable);
    }

    /**
     * 根据主键id删除
     * @return
     */
    @RequestMapping(value = "/{lableId}",method = RequestMethod.DELETE)
    @ApiOperation(value = "根据主键id删除")
    public Result delete(@PathVariable("lableId")String lableId){
        lableService.delete(lableId);
        return new Result(true, StatusCode.OK,"删除成功");
    }
}
