package com.burton.cloud.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EntityScan(basePackages = "com.burton.cloud.common.domain.movie")
@EnableFeignClients
public class MovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
    }

}
