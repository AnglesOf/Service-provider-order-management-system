package com.bjpowernode.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Cache implements Serializable {
    public String visitCount;
    public String serversCount;
    public String ordersCount;

    public Cache() {
    }

    public Cache(String visitCount, String ordersCount, String serversCount) {
        this.visitCount = visitCount;
        this.ordersCount = ordersCount;
        this.serversCount = serversCount;
    }
}
