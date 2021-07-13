package com.bjpowernode.service;

import com.bjpowernode.domain.Servers;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ServersService {
    List<Servers> findAllServers();
    List<Servers> findServersById(int s_id);
    int addServers(Servers servers);
    int deleteServers(int s_id);
    int selectCounts();
}
