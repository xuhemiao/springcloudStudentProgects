package com.xu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author xhm
 * @data 2021/5/8 10:29
 */
@SpringBootApplication
@EnableEurekaServer
public class passclouseurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(passclouseurekaApplication.class,args);
    }
}
