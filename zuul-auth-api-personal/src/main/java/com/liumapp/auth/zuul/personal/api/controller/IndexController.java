package com.liumapp.auth.zuul.personal.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 3/5/18 2:48 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("/personal")
public class IndexController {

    @Value("${custom.activeInfo}")
    private String activeInfo;

    @RequestMapping("/")
    public String index (ModelMap model) {
        return "Hello , this is Personal api demo ";
    }

    @RequestMapping("/hello")
    public ResponseEntity<?> hello () {
        return ResponseEntity.ok("hello , and active info is : " + activeInfo);
    }

}
