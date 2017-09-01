package com.allen.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2017-08-31 18:18
 * Version  1.0
 */
@WebFilter(filterName = "ipAddressFilter", urlPatterns = "/*", initParams = {@WebInitParam(name = "exclusions", value = "*.png,*,jpg,*.gif,*.bmp,*.ico,*.jsp,*.js,*.css,*.html")})
public class IpAddressFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("过滤器：" + filterConfig.getFilterName() + "初始化...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        System.out.println("IpAddressFilter过滤器==>请求：" + request.getServletPath() + "进入");
        String contextConfigLocation = request.getServletContext().getInitParameter("contextConfigLocation");
        System.out.println(contextConfigLocation);
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

        System.out.println("过滤器：IpAddressFilter销毁...");
    }
}
