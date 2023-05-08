package com.ly.orderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author LY
 * @Title: com.ly.orderService
 * @Description: 描述
 * @date 2023/5/7 18:45
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.ly")
@ComponentScan(basePackages = "com.ly")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
