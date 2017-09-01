package com.allen.controller;

import com.allen.domain.User;
import com.allen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2017-08-31 17:08
 * Version  1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/get")
    public User hello() {

        User user = User.builder().id(1).name("allen").age(25).sex(1).hobby("basketball").build();
        return user;
    }

    @RequestMapping(value = "/add")
    public String add() {

        int res = userService.addUser();
        return res == 1 ? "success" : "failed";
    }
}
