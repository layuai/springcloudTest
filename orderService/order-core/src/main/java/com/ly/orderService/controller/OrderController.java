package com.ly.orderService.controller;

import com.ly.orderService.entity.Order;

import com.ly.userService.api.UserControllerApi;
import com.ly.userService.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 * @Title: com.ly.orderService
 * @Description: 描述
 * @date 2023/5/7 18:28
 */
@RestController
@Slf4j
@RequestMapping("/OrderController")
public class OrderController {
    @Autowired
    private UserControllerApi userControllerApi;

    @GetMapping("/order/{id}")
    public Order orderQuery(@PathVariable("id") String id) {
        Order order = new Order();
        order.setId("111");
        order.setName("金属");
        order.setDate("20230507");
        log.info(order.toString());
        return order;
    }

    @GetMapping("/order/user/{id}")
    public User userQuery(@PathVariable("id") String id) {
        User user = userControllerApi.userQuery(id);
        log.info(user.toString());
        return user;
    }
}
