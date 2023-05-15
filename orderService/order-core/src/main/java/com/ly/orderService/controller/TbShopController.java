package com.ly.orderService.controller;

import com.ly.orderService.common.result.Result;
import com.ly.orderService.service.TbShopService;
import com.ly.orderService.entity.TbShop;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * tb_shop 控制层。
 *
 * @author
 * @since 2023-05-14 18:30:24
 */
@RestController
@Api(tags = "商品模块")
@RequestMapping("/tbShopController")
public class TbShopController {

    @Autowired
    private TbShopService tbShopService;

    // 查询所有TbShop
    @Operation(summary = "查询所有商品")
    @GetMapping("")
    public Result<List<TbShop>> findAllTbShops(@RequestParam("pageNo") long pageNo, @RequestParam("pageSize") long pageSize) {
        return Result.success(tbShopService.findAllTbShops(pageNo, pageSize));
    }

    // 根据id查询TbShop
    @ApiOperation(value = "根据id查询商品")
    @GetMapping("/{id}")
    public TbShop getTbShopById(@PathVariable Long id) {
        return tbShopService.getTbShopById(id);
    }

    // 新增TbShop
    @Operation(summary = "新增商品")
    @PostMapping("")
    public TbShop addTbShop(@RequestBody TbShop tbShop) {
        return tbShopService.addTbShop(tbShop);
    }

    // 修改TbShop
    @Operation(summary = "根据id修改商品")
    @PutMapping("/{id}")
    public TbShop updateTbShop(@PathVariable Long id, @RequestBody TbShop tbShop) {
        TbShop updateTbShop = tbShopService.getTbShopById(id);
        // 修改值
        return tbShopService.updateTbShop(tbShop);
    }

    // 删除TbShop
    @Operation(summary = "根据id删除商品")
    @DeleteMapping("/{id}")
    public void deleteTbShop(@PathVariable Long id) {
        tbShopService.deleteTbShop(id);
    }
}
