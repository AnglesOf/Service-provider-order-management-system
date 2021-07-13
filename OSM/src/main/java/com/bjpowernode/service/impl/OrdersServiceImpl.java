package com.bjpowernode.service.impl;

import com.bjpowernode.dao.OrdersDao;
import com.bjpowernode.domain.Orders;
import com.bjpowernode.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersDao ordersDao;

    @Override
    public List<Orders> findAllOrders() {
        return ordersDao.selectOrders();
    }

    @Override
    public List<Orders> findOrdersById(int o_id) {
        return ordersDao.selectOrdersById(o_id);
    }

    @Override
    public int addOrders(Orders orders) {
        return ordersDao.insertOrders(orders);
    }

    @Override
    public int deleteOrders(int s_id) {
        return ordersDao.deleteOrders(s_id);
    }

    @Override
    public int selectCounts() {
        return ordersDao.selectCounts();
    }
}
