package com.bjpowernode.controller;

import com.bjpowernode.service.impl.RedisServiceImpl;
import com.bjpowernode.domain.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
    @Autowired
    @Qualifier(value = "redisService")
    public RedisServiceImpl redisServiceImpl;

    @ResponseBody
    @RequestMapping("/getCache")
    public Cache getCache(){
        System.out.println(redisServiceImpl.get("visitCount") + "" + redisServiceImpl.get("ordersCount") + redisServiceImpl.get("serversCount"));
        return new Cache(redisServiceImpl.get("visitCount"), redisServiceImpl.get("ordersCount"), redisServiceImpl.get("serversCount"));
    }
}
