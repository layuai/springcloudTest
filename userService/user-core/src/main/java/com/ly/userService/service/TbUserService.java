package com.ly.userService.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ly.userService.entity.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 *
 */
public interface TbUserService extends IService<TbUser> {

    // 查询所有TbUser
    List<TbUser> findAllTbUsers(long pageNo, long pageSize);

    // 根据id查询TbUser
    TbUser getTbUserById(@PathVariable Long id);

    // 新增TbUser
    TbUser addTbUser(@RequestBody TbUser tbUser);

    // 修改TbUser
    TbUser updateTbUser(@RequestBody TbUser tbUser);

    // 删除TbUser
    void deleteTbUser(@PathVariable Long id);

}
