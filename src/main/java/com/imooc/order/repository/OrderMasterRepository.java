package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lihaochun on 2018/10/30.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{
}
