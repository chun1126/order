package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lihaochun on 2018/11/3.
 */
@RestController
@Slf4j
public class ClientController {

    @GetMapping("getProductMsg")
    public String getProductMsg(){



        log.info("response={}",response);
        return response;

    }
}
