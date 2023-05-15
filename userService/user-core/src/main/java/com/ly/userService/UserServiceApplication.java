package com.ly.userService;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LY
 * @Title: com.ly.userservice
 * @Description: 描述
 * @date 2023/5/6 18:26
 */
@SpringBootApplication
@EnableSwagger2
@EnableKnife4j
@EnableFeignClients(basePackages = "com.ly")
@ComponentScan(basePackages = "com.ly")
@MapperScan("com.ly.**.mapper")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
