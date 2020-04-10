package com.example.consumer80.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CBeann
 * @create 2020-04-10 18:56
 */
@RestController
public class HelloController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @Autowired
    private RestTemplate restTemplate;

    //请求的服务名称
    private String serverURL = "http://provider";

    @GetMapping("/consumer/get/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject(serverURL + "/provider/get/" + id, String.class);
    }

}
