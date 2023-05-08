package com.ly.orderService.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author LY
 * @Title: com.ly.orderService.entity
 * @Description: 描述
 * @date 2023/5/7 18:43
 */
@Data
@ToString
public class Order {
    private String id;
    private String name;
    private String date;
}
