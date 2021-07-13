package com.bjpowernode.controller;

import com.bjpowernode.domain.Orders;
import com.bjpowernode.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    @Qualifier(value = "ordersService")
    public OrdersService ordersService;

    @RequestMapping("/findOrders")
    public ModelAndView findServices(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("ordersList", ordersService.findAllOrders());
        mv.setViewName("forward:/WEB-INF/views/ListOrders.jsp");
        return mv;
    }

    @RequestMapping("/searchByOid")
    private ModelAndView findServicesById(int o_id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("ordersList", ordersService.findOrdersById(o_id));
        mv.setViewName("forward:/WEB-INF/views/ListOrders.jsp");
        return mv;
    }

    @RequestMapping("/addOrders")
    public ModelAndView addServices(Orders orders){
        ModelAndView mv = new ModelAndView();
        ordersService.addOrders(orders);
        mv.addObject("ordersList", ordersService.findAllOrders());
        mv.setViewName("forward:/WEB-INF/views/ListOrders.jsp");
        return mv;
    }

    @RequestMapping("/removeOrders")
    public ModelAndView removeServices(int o_id){
        ModelAndView mv = new ModelAndView();
        ordersService.deleteOrders(o_id);
        mv.addObject("ordersList", ordersService.findAllOrders());
        mv.setViewName("forward:/WEB-INF/views/ListOrders.jsp");
        return mv;
    }

}
