package com.example.server1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloud
 * @description: 测试服务1
 * @author: yinyihao
 * @create: 2021-05-12 15:46
 **/
@RestController
public class Service1Hello {

    @Autowired
    RestTemplate restTemplate;


    @Value("${server.port}")
    String prot;
    @RequestMapping("/getHome1")
    public String getHome1(@RequestParam String name){
        String forObject = restTemplate.getForObject("http://SERVER2/getHome2?name=" + name, String.class);
        return name+"的端口号是"+prot+"-=-=-=-=-=-=-=-=-=-="+forObject;
    }
}
