package com.example.server2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloud
 * @description: 测试服务1
 * @author: yinyihao
 * @create: 2021-05-12 15:46
 **/
@RestController
public class Service2Hello {

    @Value("${server.port}")
    String prot;
    @RequestMapping("/getHome2")
    public String getHome2(@RequestParam String name){
        return name+"的端口号是"+prot;
    }
}
