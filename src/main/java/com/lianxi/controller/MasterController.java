package com.lianxi.controller;

import com.lianxi.entity.Master;
import com.lianxi.service.Imp.UserService;
import com.lianxi.service.MasterService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/master")
public class MasterController {
    @Resource
    private MasterService masterService;
    @Resource
    private UserService userService;
    @RequestMapping(value = "/login/{username}/{pwd}",method = RequestMethod.POST)
    public Master login(@PathVariable("username") String username,@PathVariable("pwd") String pwd){
        try {
            userService.login(username,pwd);
            Master master = masterService.findByNumber(username);
            return master;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
