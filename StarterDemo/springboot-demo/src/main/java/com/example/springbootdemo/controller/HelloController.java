package com.example.springbootdemo.controller;

import com.myredis.MyRedisTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * @author CBeann
 * @create 2020-05-30 15:25
 */
@RestController
public class HelloController {

    @Autowired
    private MyRedisTemplate myRedisTemplate;


    @RequestMapping("/hello")
    public String hello(){
        myRedisTemplate.setString("key2", LocalTime.now().toString());
        return LocalTime.now().toString();
    }

//    @RequestMapping("/hello")
//    public String hello2(){
//        return LocalTime.now().toString();
//    }
}
