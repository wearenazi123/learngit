package com.xyz.dbtest.controller;

import com.xyz.dbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //声明为一个Restful的Controller
public class UserController {
    @Autowired //自动连接到UserService Bean
    private UserService userService;

    @RequestMapping(value = "/show")
    public String show() {
        return userService.show();
    }

    @RequestMapping(value = "/showDao")
    public Object showDao(int age) {
        return userService.showDao(age);
    }

    @RequestMapping(value = "/insert")
    public String insert(String name, int age) {
        return userService.insert(name, age);
    }
}