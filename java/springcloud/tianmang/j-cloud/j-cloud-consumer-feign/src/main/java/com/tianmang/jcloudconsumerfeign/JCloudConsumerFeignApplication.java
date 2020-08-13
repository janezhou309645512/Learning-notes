package com.tianmang.jcloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
@EnableFeignClients(basePackages = "com.tianmang.*") //开启feign
public class JCloudConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudConsumerFeignApplication.class, args);
    }

}
