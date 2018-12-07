package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderMaster;
import com.imooc.order.enums.OrderStatus;
import com.imooc.order.enums.PayStatus;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by lihaochun on 2018/10/30.
 */
public class OrderMasterRepositoryTest extends OrderApplicationTests{
    @Autowired
    private OrderMasterRepository orderMasterRepository;
    @Test
    public void testSave(){
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId("11222");
        orderMaster.setBuyerName("李浩春");
        orderMaster.setBuyerPhone("13277890009");
        orderMaster.setBuyerAddress("北京市昌平");
        orderMaster.setBuyerOpenid("1102220");
        orderMaster.setOrderAmount(new BigDecimal(2.7));
        orderMaster.setOrderStatus(OrderStatus.NEW.getCode());
        orderMaster.setPayStatus(PayStatus.WAIT.getCode());


        OrderMaster result=orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result!=null);
    }

}