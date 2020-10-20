package com.jlq.controller;

import com.jlq.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/20 11:46
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值：String
     * @param model
     * @return
     */
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

    /**
     * 返回值：void
     *          请求转发一次请求，不用编写项目名称
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行...");
        //转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");

        //设置中文乱码
//        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        //直接会进行响应
        response.getWriter().print("你好");
        return;
    }

}


