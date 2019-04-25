package com.lianxi.controller;

import com.lianxi.service.help.AssistService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/wreck")
public class AssistController {
    @Resource
    private AssistService assistService;
    @RequestMapping("/one/{cellphoneId}")
    public List<Map> one(@PathVariable("cellphoneId") Integer cellphoneId){
        return assistService.one(cellphoneId);
    }
    @RequestMapping("/two/{cellphoneId}")
    public List<Map> two(@PathVariable("cellphoneId")Integer cellphoneId){
        return assistService.two(cellphoneId);
    }
    @RequestMapping("/three/{cellphoneId}")
    public List<Map> three(@PathVariable("cellphoneId")Integer cellphoneId){
        return assistService.three(cellphoneId);
    }
}
