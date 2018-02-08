package com.liumapp.auth.zuul.core.config;

import com.liumapp.auth.zuul.core.entity.Guest;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class UtilConfig {

    @Bean
    @ConfigurationProperties(prefix = "liumapp.module.util")
    public UtilParams utilParams(){
        UtilParams utilParams = new UtilParams();
        return utilParams;
    }

    @Bean
    public Guest guest(UtilParams utilParams) {
        Guest guest = new Guest();
        guest.setAppKey(utilParams.getAppKey());
        return guest;
    }

}
