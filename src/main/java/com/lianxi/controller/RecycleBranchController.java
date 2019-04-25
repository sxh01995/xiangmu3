package com.lianxi.controller;

import com.lianxi.service.RecycleBranchService;
import com.lianxi.service.help.AssistService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/r-branch")
public class RecycleBranchController {
    @Resource
    private RecycleBranchService recycleBranchService;
    @Resource
    private AssistService assistService;
    @RequestMapping("/help/{sortId}/{cId}")
    public String findHelp(@PathVariable("sortId") String sortId,@PathVariable("cId")Integer cId){
        return assistService.saveAssess(sortId,cId);
    }
}
