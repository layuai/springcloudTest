package com.ly.userservice.controller;

import com.ly.userservice.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 * @Title: com.ly
 * @Description: 描述
 * @date 2023/5/6 18:02
 */
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User userQuery(@PathVariable("id") String id) {
        User user = new User();
        user.setName("ly" + id);
        user.setAge(10);
        return user;
    }
}