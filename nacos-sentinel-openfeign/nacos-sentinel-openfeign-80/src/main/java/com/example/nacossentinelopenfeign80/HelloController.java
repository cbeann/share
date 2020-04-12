package com.example.nacossentinelopenfeign80;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2020-04-12 18:18
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;


    @GetMapping(value = "/consumer/get/{id}")
    public String paymentSQL(@PathVariable("id") Long id) {
        return helloService.PaymentSQL(id);
    }
}
