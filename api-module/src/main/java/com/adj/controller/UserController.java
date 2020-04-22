package com.adj.controller;

import com.adj.model.Result;
import com.adj.model.po.User;
import com.adj.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Reference(loadbalance="roundrobin")
    private UserService userService;

    @GetMapping("/{userId}")
    public Result getUser(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        return Result.ok(user);
    }
}
