package org.faxuexiaoxin.standarddemo.controller;

import org.faxuexiaoxin.standarddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/addData")
    public String test(){
        userService.addRandomData();
        return "数据添加成功";
    }
}
