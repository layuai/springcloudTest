package com.ly.orderService.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ly.orderService.service.TbShopService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.orderService.entity.TbShop;
import com.ly.orderService.mapper.TbShopMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 *
 */
@Service
public class TbShopServiceImpl extends ServiceImpl<TbShopMapper, TbShop>
        implements TbShopService {

    @Resource
    private TbShopMapper tbShopMapper;

    // 查询所有TbShop
    @Override
    public List<TbShop> findAllTbShops(long pageNo, long pageSize) {
        Page<TbShop> page = new Page<>(pageNo, pageSize);
        return tbShopMapper.findAllTbShops(page);
    }

    // 根据id查询TbShop
    @Override
    public TbShop getTbShopById(Long id) {
        return tbShopMapper.getTbShopById(id);
    }

    // 新增TbShop
    @Override
    public TbShop addTbShop(TbShop tbShop) {
        return tbShopMapper.addTbShop(tbShop);
    }

    // 修改TbShop
    @Override
    public TbShop updateTbShop(TbShop tbShop) {
        return tbShopMapper.updateTbShop(tbShop);
    }

    // 删除TbShop
    @Override
    public void deleteTbShop(Long id) {
        tbShopMapper.deleteTbShop(id);
    }
}




