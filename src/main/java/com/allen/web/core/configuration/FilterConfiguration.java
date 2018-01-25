package com.allen.web.core.configuration;

import com.allen.web.filter.IpAddressFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @Author yang_tao@<yangtao.letzgo.com.cn>
 * @Date 2017-08-31 17:08
 * @Version 1.0
 */
@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean encodingFilter() {
        FilterRegistrationBean<CharacterEncodingFilter> filter = new FilterRegistrationBean(new CharacterEncodingFilter());
        filter.addInitParameter("encoding", "UTF-8");
        filter.addInitParameter("forceEncoding", "true");
        filter.addUrlPatterns("/*");
        return filter;
    }

    @Bean
    public FilterRegistrationBean ipAddressFilter() {
        FilterRegistrationBean<IpAddressFilter> filter = new FilterRegistrationBean(new IpAddressFilter());
        filter.addUrlPatterns("/*");
        return filter;
    }
}
