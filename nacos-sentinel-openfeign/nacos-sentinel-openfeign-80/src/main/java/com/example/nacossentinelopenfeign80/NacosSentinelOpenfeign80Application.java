package com.example.nacossentinelopenfeign80;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosSentinelOpenfeign80Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosSentinelOpenfeign80Application.class, args);
    }



    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
