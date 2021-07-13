package com.bjpowernode.domain;

import org.springframework.stereotype.Component;

@Component
public class Totals {
    int s_id;
    String user_name;
    int serversCount;
    int ordersCount;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getServersCount() {
        return serversCount;
    }

    public void setServersCount(int serversCount) {
        this.serversCount = serversCount;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(int ordersCount) {
        this.ordersCount = ordersCount;
    }
}
