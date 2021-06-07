package com.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloud
 * @description: 控制层
 * @author: yinyihao
 * @create: 2021-05-12 15:55
 **/
@RestController
public class HelloControl {
    @Autowired
    HelloService helloService;

    @RequestMapping("/getHome")
    public String getHome(@RequestParam String name){
        return helloService.getHome("ribbon---"+name);
    }
}
