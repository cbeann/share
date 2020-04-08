package com.example.provider8001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author CBeann
 * @create 2020-04-08 19:50
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("/provider/consul")
    public String paymentConsul() {
        return "springCloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
