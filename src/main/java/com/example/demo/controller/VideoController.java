package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @RestController 返回json格式数据
 * @Controller 不会返回json格式数据
 */
//@Controller
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

//    @RequestMapping("list")
    @GetMapping("list")
    public Object list(){
        Map<String,String> map = new HashMap<>();
        map.put("1","面试专题课程");
        map.put("2","SpringCloud微服务课程");

        return map;
    }
}
