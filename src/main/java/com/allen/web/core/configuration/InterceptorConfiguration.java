package com.allen.web.core.configuration;

import com.allen.web.interceptor.LoginInterceptor;
import com.allen.web.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2017-08-31 18:25
 * Version  1.0
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/login/**");
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/user/**");
        super.addInterceptors(registry);
    }

}
