package com.imooc.order.enums;

import lombok.Getter;

/**
 * Created by lihaochun on 2018/10/30.
 */
@Getter
public enum OrderStatus {
    NEW(0,"新订单"),
    FINISH(1,"完结"),

    CANCEL(2,"取消"),
            ;
    private Integer code;
    private String message;

    OrderStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
