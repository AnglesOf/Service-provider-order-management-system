package com.bjpowernode.domain;

import org.springframework.stereotype.Component;

@Component
public class Servers {
    int s_id;
    int p_id;
    String pole_name;
    String user_name;
    String user_tel;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getPole_name() {
        return pole_name;
    }

    public void setPole_name(String pole_name) {
        this.pole_name = pole_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }
}
