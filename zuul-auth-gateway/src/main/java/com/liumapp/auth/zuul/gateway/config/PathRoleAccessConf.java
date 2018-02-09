package com.liumapp.auth.zuul.gateway.config;

import com.liumapp.auth.zuul.gateway.data.RoleMap;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liumapp on 2/9/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class PathRoleAccessConf {

    @Bean
    @ConfigurationProperties(prefix = "liumapp.gateway.roles")
    public RoleMap roleMap () {
        RoleMap roleMap = new RoleMap();
        return roleMap;
    }

}
