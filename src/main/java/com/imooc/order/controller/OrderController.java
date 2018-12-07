package com.imooc.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihaochun on 2018/10/31.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    /*
    * 1、参数校验
    * 2、查询商品信息（调用商品服务）
    * 3、计算总价
    * 4、扣库存（调用商品服务）
    * 5、订单入库
    * */
    public void create(){

    }

}
