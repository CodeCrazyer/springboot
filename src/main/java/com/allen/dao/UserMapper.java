package com.allen.dao;

import com.allen.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2017-09-01 13:31
 * Version  1.0
 */
@Repository
public interface UserMapper {

    List<User> selectAll();

    int insert(User user);

}
