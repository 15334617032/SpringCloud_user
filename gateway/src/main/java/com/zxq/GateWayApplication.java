package com.zxq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zxq
 * @DESCRIPTION
 * @create 2021/5/8
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class,args);
    }

}
