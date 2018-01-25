package com.allen.web.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author   yang_tao@<yangtao.letzgo.com.cn>
 * @Date     2017-08-31 17:08
 * @Version  1.0
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.allen.web.**")
@ComponentScan(basePackages = "com.allen.**")
public class MyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWebApplication.class, args);
    }

    /**
     * 默认的内嵌容器Tomcat切换为Jetty
     *
     * @return
     */
    @Bean
    public ServletWebServerFactoryAutoConfiguration.EmbeddedJetty container() {

        return new ServletWebServerFactoryAutoConfiguration.EmbeddedJetty();
    }
}
