package com.example.nacossentinelopenfeign80;

import org.springframework.stereotype.Component;

/**
 * @author CBeann
 * @create 2020-04-12 18:16
 */
@Component
public class HelloFallbackService implements HelloService {
    @Override
    public String PaymentSQL(Long id) {
        return "------fallback";
    }
}