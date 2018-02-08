package com.liumapp.auth.zuul.company.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 2/2/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping("boss")
public class BossController {

    @RequestMapping("/hello")
    public ResponseEntity<?> hello () {
        return ResponseEntity.ok("hello");
    }

    @RequestMapping("/")
    public ResponseEntity<?> getBossGreeting () {
        return ResponseEntity.ok("Greeting from boss");
    }

}
