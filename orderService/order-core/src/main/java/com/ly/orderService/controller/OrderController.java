package com.ly.orderService.controller;

import com.ly.orderService.common.result.Result;
import com.ly.orderService.entity.Order;

import com.ly.userService.api.UserControllerApi;
import com.ly.userService.entity.TbUser;
import com.ly.userService.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author LY
 * @Title: com.ly.orderService
 * @Description: 描述
 * @date 2023/5/7 18:28
 */
@RestController
@Slf4j
@Validated
@Api(tags = "产品模块")
@RequestMapping("/OrderController")
public class OrderController {
    @Autowired
    private UserControllerApi userControllerApi;

    @ApiOperation(value = "产品查询")
//    @ApiImplicitParam(name = "id", value = "id", required = true)
    @GetMapping("/order/{id}")
    public Result<Order> orderQuery(@PathVariable("id") @NotBlank String id) {
        Order order = new Order();
        order.setId("111");
        order.setName("金属:" + id);
        order.setDate("20230507");
        log.info(order.toString());
        return Result.success(order);
    }

    @Operation(summary = "用户根据id查询")
    @GetMapping("/order/user/{id}")
    public Result<User> userQuery(@PathVariable("id") String id) {
        User user = userControllerApi.userQuery(id);
        log.info(user.toString());
        return Result.success(user);
    }

    @Operation(summary = "分页查询所有用户")
    @GetMapping("/user")
    public Result<List<TbUser>> findAllTbUsers(@RequestParam("pageNo") long pageNo, @RequestParam("pageSize") long pageSize) {
        List<TbUser> allTbUsers = userControllerApi.findAllTbUsers(pageNo, pageSize);
        return Result.success(allTbUsers);
    }
}
