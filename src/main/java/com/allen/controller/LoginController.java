package com.allen.controller;

import com.allen.util.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author   yang_tao@<yangtao.letzgo.com.cn>
 * @Date     2017-08-31 17:08
 * @Version  1.0
 */
@Controller
public class LoginController {

    @Autowired
    private Book book;

    @RequestMapping(value = "/")
    public String welcome() {

        return "/statics/html/index.html";
    }

    @ResponseBody
    @RequestMapping(value = "/login")
    public String login() {

        return book.toString();
    }

}
