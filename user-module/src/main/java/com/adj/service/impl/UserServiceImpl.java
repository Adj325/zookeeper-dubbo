package com.adj.service.impl;

import com.adj.model.po.User;
import com.adj.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Service(timeout = 2000)
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private String port;

    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("你大爷-" + port);
        return user;
    }
}
