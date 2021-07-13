package com.bjpowernode.dao;

import com.bjpowernode.domain.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDao {
    List<Orders> selectOrders();
    List<Orders> selectOrdersById(int o_id);
    int insertOrders(Orders orders);
    int deleteOrders(int o_id);
    int selectCounts();
}
