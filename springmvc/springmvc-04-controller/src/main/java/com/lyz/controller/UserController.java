package com.lyz.controller;

import com.lyz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyunzhe
 * @create 2020-12-03
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(String name, Model model){
        System.out.println("name = " + name);
        model.addAttribute("msg",name);
        return "/test";
    }
}
