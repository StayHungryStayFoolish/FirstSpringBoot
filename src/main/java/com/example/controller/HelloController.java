package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bonismo@hotmail.com
 * 上午12:26 on 17/12/2.
 */
@RestController
public class HelloController {

    @RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)
    public String say() {
        return "Hi, Bonismo ！";
    }
}
