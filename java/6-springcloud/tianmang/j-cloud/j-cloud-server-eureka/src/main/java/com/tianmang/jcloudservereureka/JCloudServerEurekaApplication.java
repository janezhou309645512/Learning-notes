package com.tianmang.jcloudservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class JCloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudServerEurekaApplication.class, args);
    }

}
