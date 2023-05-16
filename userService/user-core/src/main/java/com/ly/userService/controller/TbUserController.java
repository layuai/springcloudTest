package com.ly.userService.controller;

import com.ly.userService.service.TbUserService;
import com.ly.userService.entity.TbUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * tb_user 控制层。
 *
 * @author
 * @since 2023-05-13 16:50:07
 */
@RestController
@Api(tags = "用户模块")
@RequestMapping("/tbUserController")
public class TbUserController {

    @Autowired
    private TbUserService tbUserService;

    // 查询所有TbUser
    @ApiOperation(value = "查询所有TbUser")
    @GetMapping("")
    public List<TbUser> findAllTbUsers(@RequestParam("pageNo") long pageNo, @RequestParam("pageSize") long pageSize) {
        List<TbUser> userIPage = tbUserService.findAllTbUsers(pageNo, pageSize);
        return userIPage;
    }

    // 根据id查询TbUser
    @Operation(summary = "根据id查询TbUser")
    @GetMapping("/{id}")
    public TbUser getTbUserById(@PathVariable("id") long id) {
        return tbUserService.getTbUserById(id);
    }

    // 新增TbUser
    @PostMapping("")
    public TbUser addTbUser(@RequestBody TbUser tbUser) {
        return tbUserService.addTbUser(tbUser);
    }

    // 修改TbUser
    @PutMapping("/{id}")
    public TbUser updateTbUser(@PathVariable long id, @RequestBody TbUser tbUser) {
        TbUser updateTbUser = tbUserService.getTbUserById(id);
        // 修改值
        return tbUserService.updateTbUser(tbUser);
    }

    // 删除TbUser
    @DeleteMapping("/{id}")
    public void deleteTbUser(@PathVariable long id) {
        tbUserService.deleteTbUser(id);
    }
}
