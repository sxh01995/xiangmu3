package com.lianxi.controller;

import com.lianxi.entity.Cellphone;
import com.lianxi.service.CellphoneService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cc")
public class CellphoneController {
    @Resource
    private CellphoneService cellphoneService;
//    分页查询
    @RequestMapping(value = "/findAll/{id}",method = RequestMethod.GET)
    public List<Cellphone> findAll(@PathVariable("id") Integer id){
        List<Cellphone> list = cellphoneService.findAll(id);
        return list;
    }
//    根据型号查询
    @RequestMapping(value = "/findById/{modelId}/{id}",method = RequestMethod.GET)
    public List<Cellphone> findById(@PathVariable("modelId")String modelId,@PathVariable("id")Integer id){
        List<Cellphone> byIdList = cellphoneService.findById(modelId, id);
        return byIdList;
    }

//    模糊查询
    @RequestMapping(value = "/findDim/{name}/{id}",method = RequestMethod.GET)
    public List<Cellphone> findDim(@PathVariable("name")String name,@PathVariable("id")Integer id){
        List<Cellphone> dimList = cellphoneService.findDim(name, id);
        return dimList;
    }
//    根据ID查询
    @RequestMapping(value = "/findId/{id}",method = RequestMethod.GET)
    public Cellphone findId(@PathVariable("id")Integer id){
        return cellphoneService.findId(id);
    }
}
