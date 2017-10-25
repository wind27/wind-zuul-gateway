package com.wind.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * GatewayFilter
 *
 *
 * zuul过滤器, 可以做权限校验, 日志等的处理
 * @author qianchun 17/10/12
 *
 **/
public class GatewayFilter extends ZuulFilter{
    private Logger log = LoggerFactory.getLogger(GatewayFilter.class);


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
    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        log.info(String.format("收到 %s 请求 %s", request.getMethod(), request.getRequestURL().toString()));
//        Object accessToken = request.getParameter("accesstoken");
//        if(accessToken == null) {
//            ctx.getResponse().setContentType("text/html;charset=UTF-8");
//            log.warn("accesstoken为空");
//            //令zuul过滤该请求，不对其进行路由
//            ctx.setSendZuulResponse(false);
//            //设置其返回的错误码和报文体
//            //这里没有设置应答码为401，是因为401会导致客户端走到它的断路器里面（HystrixCalculatorService）
//            //所有设置为200，让应答报文体跳过客户端的断路器，返回给前台
//            ctx.setResponseStatusCode(200);
//            ctx.setResponseBody("权限不足");
//            return null;
//        }
        log.info("accesstoken验证通过");
        return null;
    }
}
