package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * Created by lihaochun on 2018/10/31.
 */
public interface OrderService {
    OrderDTO create(OrderDTO orderDTO);
}
