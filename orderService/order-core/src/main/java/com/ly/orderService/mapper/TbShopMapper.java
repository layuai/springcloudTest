package com.ly.orderService.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ly.orderService.config.MybatisRedisCache;
import com.ly.orderService.entity.TbShop;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Entity com.ly.orderService.entity.TbShop
 */
@Mapper
@CacheNamespace(implementation = MybatisRedisCache.class, eviction = MybatisRedisCache.class)
public interface TbShopMapper extends BaseMapper<TbShop> {

    // 查询所有TbShop
    List<TbShop> findAllTbShops(Page<TbShop> page);

    // 根据id查询TbShop
    TbShop getTbShopById(@PathVariable Long id);

    // 新增TbShop
    TbShop addTbShop(@RequestBody TbShop tbShop);

    // 修改TbShop
    TbShop updateTbShop(@RequestBody TbShop tbShop);

    // 删除TbShop
    void deleteTbShop(@PathVariable Long id);

}




