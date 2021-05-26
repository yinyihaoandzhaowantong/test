package com.example.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "server1")/*调用Service1服务接口*/
public interface FeignService {

    @RequestMapping(value = "/getHome1",method = RequestMethod.POST)
    String getService1Home1(@RequestParam(value = "name") String name);
}
