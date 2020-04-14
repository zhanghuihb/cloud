package com.burton.cloud.movie.controller;

import com.burton.cloud.common.domain.user.User;
import com.burton.cloud.common.feign.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: 大瞳小沐
 * Date: 2019/3/21
 * Time: 21:31
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userFeignClient.findById(id);
    }

//    @GetMapping("/log-user-instance")
//    public void logUserInstance(){
//        final ServiceInstance userInstance = this.loadBalancerClient.choose("user");
//        // 打印当前选择的那个节点
//        LOGGER.info("{}:{}:{}", userInstance.getServiceId(), userInstance.getHost(), userInstance.getPort());
//    }
}
