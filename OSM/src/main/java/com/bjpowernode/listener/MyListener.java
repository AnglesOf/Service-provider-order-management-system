package com.bjpowernode.listener;

import com.bjpowernode.service.impl.RedisServiceImpl;
import com.bjpowernode.service.OrdersService;
import com.bjpowernode.service.ServersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

//@WebListener(不能用，不能触发事件)
@Component
public class MyListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    @Qualifier(value = "ordersService")
    public OrdersService ordersService;

    @Autowired
    @Qualifier(value = "serversService")
    public ServersService serversService;

    @Autowired
    @Qualifier(value = "redisService")
    public RedisServiceImpl redisServiceImpl;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (contextRefreshedEvent.getApplicationContext().getParent() == null) { //保证只执行一次
            redisServiceImpl.set("visitCount", "1");
            // 每7分钟查询数据库数据到缓存
            new Thread(() -> {
                while (true) {
                redisServiceImpl.set("ordersCount", ordersService.selectCounts() + "");
                redisServiceImpl.set("serversCount", serversService.selectCounts() + "");
                System.out.println("Listener" + serversService.selectCounts() + "" + ordersService.selectCounts());
                try {
//                    Thread.sleep(420000);
                        Thread.sleep(1000 * 10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }
            }, "diyFirstThread").start();
        }
    }

}
