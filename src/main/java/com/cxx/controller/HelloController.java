package com.cxx.controller;

import com.cxx.properties.Girlproperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxiangxiang on 2017/3/13.
 */
@RestController
public class HelloController {

    @Autowired
    private Girlproperties girlproperties;


    @GetMapping(value = "/hello/{id}")
    public String hello(@PathVariable("id") Integer myId){

        return "hello Spring Boot!"+girlproperties.getAge()+myId;
    }
}
