package com.lyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liyunzhe
 * @create 2020-12-03
 */
@Controller
public class EcodingController {

    /*
    * 过滤器解决乱码
    * */
    @PostMapping("/e1/t1")
    public String test(String name, Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}
