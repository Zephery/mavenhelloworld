package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Zephery on 2016/5/28.
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @Resource
    private ILoginService loginServiceImpl;

    @RequestMapping(value = "login")
    public ModelAndView login(HttpServletRequest req, User user) {
        ModelAndView mv = new ModelAndView();
        User u = loginServiceImpl.validate(user.getUsername(), user.getPassword());
        if (u != null) {
            req.getSession().setAttribute("user", u);
            mv.addObject("password", u.getPassword());
            System.out.println(u.getPassword());
        }
        mv.setViewName("success");
        return mv;
    }
}
