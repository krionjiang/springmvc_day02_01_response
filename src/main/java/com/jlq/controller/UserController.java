package com.jlq.controller;

import com.jlq.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/20 11:46
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行...");
        //模拟从数据库中查询出User对象

        User user = new User();
        user.setUsername("菜菜");
        user.setPassword("123");
        user.setAge(20);
        //model对象
        model.addAttribute("user",user);
        return "success";
    }

}


