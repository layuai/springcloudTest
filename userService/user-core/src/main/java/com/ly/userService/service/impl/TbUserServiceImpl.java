package com.ly.userService.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ly.userService.service.TbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.userService.entity.TbUser;
import com.ly.userService.mapper.TbUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.*;

/**
 *
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
        implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    // 查询所有TbUser
    @Override
    public List<TbUser> findAllTbUsers() {
        Page<TbUser> page = new Page<>(1, 10);
        return tbUserMapper.findAllTbUsers(page);
    }

    // 根据id查询TbUser
    @Override
    public TbUser getTbUserById(Long id) {
        return tbUserMapper.getTbUserById(id);
    }

    // 新增TbUser
    @Override
    public TbUser addTbUser(TbUser tbUser) {
        return tbUserMapper.addTbUser(tbUser);
    }

    // 修改TbUser
    @Override
    public TbUser updateTbUser(TbUser tbUser) {
        return tbUserMapper.updateTbUser(tbUser);
    }

    // 删除TbUser
    @Override
    public void deleteTbUser(Long id) {
        tbUserMapper.deleteTbUser(id);
    }
}




