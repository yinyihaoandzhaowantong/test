package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloud
 * @description: feign控制层
 * @author: yinyihao
 * @create: 2021-05-26 09:19
 **/
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/feign",method = RequestMethod.GET)
    public String getService1Home1(String name){
        return feignService.getService1Home1(name);
    }
}
