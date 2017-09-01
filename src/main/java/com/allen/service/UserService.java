package com.allen.service;

import com.allen.dao.UserMapper;
import com.allen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2017-09-01 15:23
 * Version  1.0
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public int addUser() {

        User user = User.builder().name("allen").balance(666666d).build();
        return userMapper.insert(user);
    }

}
