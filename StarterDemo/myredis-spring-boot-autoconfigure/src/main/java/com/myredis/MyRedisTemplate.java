package com.myredis;

import redis.clients.jedis.Jedis;

/**
 * @author CBeann
 * @create 2020-05-30 15:03
 */
public class MyRedisTemplate {

    private Jedis jedis;

    public MyRedisTemplate(Jedis jedis) {
        this.jedis = jedis;
    }


    public String  setString(String key ,String val){

        String set = jedis.set(key, val);
        return set;

    }

    public Long  delKey(String key){
        Long del = jedis.del(key);
        return del;

    }

    public MyRedisTemplate() {
    }
}
