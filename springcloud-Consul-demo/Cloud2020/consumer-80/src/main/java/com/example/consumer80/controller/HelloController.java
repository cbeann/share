package com.example.consumer80.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CBeann
 * @create 2020-04-08 19:59
 */
@RestController
public class HelloController {
    //调用服务的名称provider-8001
    private static final String INVOKE_URL = "http://provider";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/provider/consul", String.class);
        return result;
    }

}
