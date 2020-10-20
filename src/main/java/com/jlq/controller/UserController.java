package com.jlq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/20 11:46
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(){
        System.out.println("testString执行...");
        return "success";
    }

}


