package com.ly.userService.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ly.userService.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.*;

/**
 * @Entity com.ly.userService.entity.TbUser
 */
@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {

// 查询所有TbUser
List<TbUser>  findAllTbUsers(Page<TbUser> page);

// 根据id查询TbUser
TbUser getTbUserById(@PathVariable Long id);

// 新增TbUser
TbUser addTbUser(@RequestBody TbUser tbUser);

// 修改TbUser
TbUser updateTbUser(@RequestBody TbUser tbUser);

// 删除TbUser
void deleteTbUser(@PathVariable Long id);

}




