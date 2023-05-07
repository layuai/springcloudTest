package com.ly.userService.api;

import com.ly.userService.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author LY
 * @Title: com.ly.userService.api
 * @Description: 描述
 * @date 2023/5/7 19:22
 */
@FeignClient(value = "user-service", contextId = "UserController", path = "/UserController")
public interface UserControllerApi {
    @GetMapping("/user/{id}")
    public User userQuery(@PathVariable("id") String id);
}
