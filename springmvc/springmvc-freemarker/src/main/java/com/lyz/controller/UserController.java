package com.lyz.controller;

import com.lyz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liyunzhe
 * @create 2020-12-10
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/info")
    public String testFreemarker(HttpServletRequest request, ModelMap modelMap) throws Exception {
        User user = new User("may", 21);

        List<String> list = new ArrayList<String>();
        list.add("Jack1");
        list.add("Jack2");
        list.add("Jack3");

        modelMap.addAttribute("list", list);
        modelMap.addAttribute("user", user);
        request.setAttribute("haha","哈哈");
        return "userinfo";
    }
}
