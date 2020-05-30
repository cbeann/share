package com.myredis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @author CBeann
 * @create 2020-05-30 14:59
 */
@Configuration
@EnableConfigurationProperties(MyRedisProperties.class)
@ConditionalOnProperty(prefix = "myredis",name = "host",
        matchIfMissing =false)//如果application.yml或者properties中没有myredis.host属性，则此类MyRedisAutoConfigulation不注入IOC容器
public class MyRedisAutoConfigulation {

    @Bean
    public Jedis jedis(MyRedisProperties myRedisProperties) {

        //获取redis的参数
        String host = myRedisProperties.getHost();
        String password = myRedisProperties.getPassword();
        // 连接redis服务
        Jedis jedis = new Jedis(host, 6379);
        jedis.auth(password);

        return jedis;


    }

    @Bean
    public MyRedisTemplate myRedisTemplate(Jedis jedis) {
        return new MyRedisTemplate(jedis);
    }


}
