package com.liumapp.auth.zuul.personal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.liumapp.auth.zuul.personal.api"})
public class Personal {

    public static void main(String[] args) {
        SpringApplication.run(Personal.class , args);
    }

}
