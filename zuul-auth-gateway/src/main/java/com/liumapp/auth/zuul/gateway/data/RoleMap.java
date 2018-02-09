package com.liumapp.auth.zuul.gateway.data;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by liumapp on 2/9/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class RoleMap {

    private HashMap<String , String> map;

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }
}
