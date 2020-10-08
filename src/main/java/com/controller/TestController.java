package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1(Model model){
        model.addAttribute("msg","test");
        return "test1";
    }

    @RequestMapping("/test2")
    public String test2(Map<String,Object> map){
        map.put("msg","<h3>test2</h3>");
        map.put("users", Arrays.asList("小乖","小青龙"));
        return "test2";
    }
}
