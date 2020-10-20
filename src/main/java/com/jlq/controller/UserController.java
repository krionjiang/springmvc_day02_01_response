package com.jlq.controller;

import com.jlq.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    /**
     * 返回 ModelAndView
     * @return ModelAndView
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView执行...");

        //创建一个ModelAndView对象
        ModelAndView mv = new ModelAndView();

        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("桂桂");
        user.setPassword("890");
        user.setAge(12);

        //把user对象存储到mv对象中，底层也会把user对象存到request对象
        mv.addObject("user",user);

        //跳转到哪个页面
        mv.setViewName("success");

        return mv;
    }

}


