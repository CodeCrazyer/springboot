package com.allen.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author yang_tao@<yangtao.letzgo.com.cn>
 * @Date 2018-01-25 16:18
 * @Version 1.0
 */
@Data
@Component
@PropertySource("classpath:config/book.properties")
@ConfigurationProperties(prefix = "book")
public class Book {

    private String name;

    private String version;

    private double price;

}
