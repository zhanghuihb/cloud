package com.burton.cloud.movie.controller;

import com.burton.cloud.common.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: 大瞳小沐
 * Date: 2019/3/21
 * Time: 21:31
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        User user = restTemplate.getForObject("http://localhost:8000/" + id, User.class);
        return user;
    }
}
