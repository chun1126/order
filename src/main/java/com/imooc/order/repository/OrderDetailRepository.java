package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by lihaochun on 2018/10/30.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String>{

}
