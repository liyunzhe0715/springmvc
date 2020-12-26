package com.lyz.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyz.pojo.User;
import com.lyz.utils.jsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author liyunzhe
 * @create 2020-12-03
 */
//@Controller
@RestController
public class UserController {

    @RequestMapping("j1")
    //@ResponseBody
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        User user = new User(1,"李蕴哲",27);
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("j2")
    public String json2() throws JsonProcessingException {

        List<User> users = new ArrayList<User>();
        User user1 = new User(1,"李蕴哲",27);
        User user2 = new User(2,"李蕴哲",27);
        User user3 = new User(3,"李蕴哲",27);
        User user4 = new User(4,"李蕴哲",27);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return JSON.toJSONString(users);
    }

    @RequestMapping("j3")
    public String json3() {

        Date date = new Date();
        return jsonUtil.getJson(date);
    }
}
