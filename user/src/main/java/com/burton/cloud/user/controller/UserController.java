package com.burton.cloud.user.controller;

import com.burton.cloud.common.domain.user.User;
import com.burton.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 大瞳小沐
 * Date: 2019/3/20
 * Time: 23:14
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        User user = userService.findById(id);
        return user;
    }
}
