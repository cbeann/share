package com.example.provider8001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2020-04-10 18:38
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/provider/get/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: " + serverPort + "\t id" + id;
    }

}
