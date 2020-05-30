package com.myredis;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author CBeann
 * @create 2020-05-30 14:51
 */
@ConfigurationProperties(prefix = "myredis")
public class MyRedisProperties {


    //ip
    private String host;
    //密码
    private String password;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
