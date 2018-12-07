package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by lihaochun on 2018/10/30.
 */
public class OrderDetailRepositoryTest extends OrderApplicationTests{
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setDetailId("12233");
        orderDetail.setOrderId("11222" +
                "");
        orderDetail.setProductIcon("www.cccc.com");
        orderDetail.setProductId("21312321");
        orderDetail.setProductName("皮蛋瘦肉粥");
        orderDetail.setProductPrice(new BigDecimal(0.2));
        orderDetail.setProductQuantity(2);
        OrderDetail result=orderDetailRepository.save(orderDetail);
        Assert.assertTrue(result!=null);

    }

}