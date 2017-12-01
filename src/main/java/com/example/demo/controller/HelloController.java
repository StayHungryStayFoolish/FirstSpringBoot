package com.example.demo.controller;

import com.example.demo.entity.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bonismo@hotmail.com
 * 上午12:26 on 17/12/2.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello","hi"},method = RequestMethod.GET)
    public String say() {
        girlProperties.setAge(20);
        return girlProperties.toString();
    }
}
