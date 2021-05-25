package com.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloud
 * @description: 测试窗帘
 * @author: yinyihao
 * @create: 2021-05-12 15:54
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String getHome(String name) {
        return restTemplate.getForObject("http://SERVER1/getHome1?name="+name,String.class);
    }
}
