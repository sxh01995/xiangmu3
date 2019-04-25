package com.lianxi.controller;

import com.lianxi.dao.CellphoneModelDao;
import com.lianxi.service.CellphoneModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cmc")
public class CellphoneModelController {
    @Autowired
    private CellphoneModelService cellphoneModelService;
    //查询所有
    @RequestMapping("/findAll")
    public List<CellphoneModelDao> findAll(){
        return cellphoneModelService.findAll();
    }
}
