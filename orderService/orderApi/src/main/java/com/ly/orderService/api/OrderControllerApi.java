package com.ly.orderService.api;

import com.ly.orderService.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author LY
 * @Title: com.ly.userService.api
 * @Description: userService提供的对外feign接口
 * @date 2023/5/7 19:22
 */
@Component
@FeignClient(value = "order-service", contextId = "Order", path = "/OrderController")
public interface OrderControllerApi {
    @GetMapping("/order/{id}")
    Order orderQuery(@PathVariable("id") String id);
}
