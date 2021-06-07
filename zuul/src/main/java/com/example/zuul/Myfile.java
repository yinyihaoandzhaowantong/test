package com.example.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: SpringCloud
 * @description: 测试zuul网关的路由过滤功能
 * @author: yinyihao
 * @create: 2021-06-04 11:47
 **/
@Component
public class Myfile extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(Myfile.class);
    /**
     * 过滤器过滤的生命周期的类型
     * pre:路由器之前
     * routing:路由器之时
     * post：路由器之后
     * error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        log.info("服务过滤器~~~~"+request.getParameterMap());
        if(token==null){
            try {
                currentContext.setSendZuulResponse(false);
                currentContext.setResponseStatusCode(401);
                currentContext.getResponse().getWriter().write("is empty token");
            } catch (Exception e) {
            }
        }
        return null;
    }
}
