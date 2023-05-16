package com.ly.userService.api;

import com.ly.userService.entity.TbUser;
import com.ly.userService.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @author LY
 * @Title: com.ly.userService.api
 * @Description: 描述
 * @date 2023/5/7 19:22
 */
@Component
@FeignClient(value = "user-service", contextId = "User", path = "/tbUserController")
public interface UserControllerApi {

    @GetMapping("")
    List<TbUser> findAllTbUsers(@RequestParam("pageNo") long pageNo, @RequestParam("pageSize") long pageSize);

    @GetMapping("/{id}")
    User userQuery(@PathVariable("id") String id);
}
