package com.allen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2017-08-31 17:08
 * Version  1.0
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login")
    public String login() {

        return "success";
    }
}
