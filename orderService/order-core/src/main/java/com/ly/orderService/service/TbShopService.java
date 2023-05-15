package com.ly.orderService.service;

import com.ly.orderService.entity.TbShop;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 *
 */
public interface TbShopService extends IService<TbShop> {

     // 查询所有TbShop
     List<TbShop> findAllTbShops(long pageNo,long pageSize);

     // 根据id查询TbShop
     TbShop getTbShopById(@PathVariable Long id);

     // 新增TbShop
     TbShop addTbShop(@RequestBody TbShop tbShop);

     // 修改TbShop
     TbShop updateTbShop(@RequestBody TbShop tbShop);

     // 删除TbShop
     void deleteTbShop(@PathVariable Long id);

}
