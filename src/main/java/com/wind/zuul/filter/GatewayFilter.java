package com.wind.zuul.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * GatewayFilter
 *
 * @author qianchun 17/10/12
 * @date
 **/
public class GatewayFilter extends ZuulFilter{
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
        return null;
    }
}
