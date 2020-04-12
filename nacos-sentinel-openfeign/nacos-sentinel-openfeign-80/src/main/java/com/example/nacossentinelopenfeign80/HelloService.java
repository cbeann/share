package com.example.nacossentinelopenfeign80;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CBeann
 * @create 2020-04-12 18:16
 */
@FeignClient(value = "provider",//服务名称
        fallback = HelloFallbackService.class)//回调方法
public interface HelloService {
    @GetMapping(value = "/provider/get/{id}")
    String PaymentSQL(@PathVariable("id") Long id);
}
