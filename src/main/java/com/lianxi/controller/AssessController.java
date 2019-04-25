package com.lianxi.controller;

import com.lianxi.entity.Assess;
import com.lianxi.service.AssessService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/Assess")
public class AssessController {
    @Resource
    private AssessService assessService;
    @RequestMapping("/findById/{assessId}")
    public Assess findByIdA(@PathVariable("assessId") String assessId){
        return assessService.findId(assessId);
    }
}
