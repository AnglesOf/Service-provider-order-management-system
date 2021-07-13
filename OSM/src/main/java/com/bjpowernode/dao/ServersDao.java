package com.bjpowernode.dao;

import com.bjpowernode.domain.Orders;
import com.bjpowernode.domain.Servers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServersDao {
    List<Servers> selectServers();
    List<Servers> selectServersById(int s_id);
    int insertServers(Servers servers);
    int deleteServers(int s_id);
    int selectCounts();
}
