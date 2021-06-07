package com.example.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * @program: SpringCloud
 * @description: 测试zuul网关的路由过滤功能
 * @author: yinyihao
 * @create: 2021-06-04 11:47
 **/
@Component
public class Myfile extends ZuulFilter {
    
    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
