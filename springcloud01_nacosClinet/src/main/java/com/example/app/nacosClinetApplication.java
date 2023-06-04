package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author YLL
 * @Date 2023/5/22 17:44
 * @PackageName:com.example
 * @ClassName: app
 * @Description: TODO
 * @Version 1.0
 */
@SpringBootApplication
//@EnableDiscoveryClient //可以不写
public class nacosClinetApplication {
    public static void main(String[] args) {
        SpringApplication.run(nacosClinetApplication.class);
    }
}
