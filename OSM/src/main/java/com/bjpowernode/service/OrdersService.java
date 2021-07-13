package com.bjpowernode.service;

import com.bjpowernode.domain.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface OrdersService {
    List<Orders> findAllOrders();
    List<Orders> findOrdersById(int o_id);
    int addOrders(Orders orders);
    int deleteOrders(int o_id);
    int selectCounts();
}
