package com.allen.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2017-08-31 17:47
 * Version  1.0
 */
@Data
@Builder
public class User {
    private Integer id;
    private String name;
    private Integer sex;
    private Integer age;
    private Date birthday;
    private String hobby;
    private Double balance;
}
