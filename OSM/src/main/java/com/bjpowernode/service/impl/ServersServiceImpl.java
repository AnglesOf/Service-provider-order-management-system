package com.bjpowernode.service.impl;

import com.bjpowernode.dao.ServersDao;
import com.bjpowernode.domain.Servers;
import com.bjpowernode.service.ServersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("serversService")
public class ServersServiceImpl implements ServersService {
    @Autowired
    private ServersDao serversDao;

    @Override
    public List<Servers> findAllServers() {
        return serversDao.selectServers();
    }

    @Override
    public List<Servers> findServersById(int s_id) {
        return serversDao.selectServersById(s_id);
    }

    @Override
    public int addServers(Servers servers) {
        return serversDao.insertServers(servers);
    }

    @Override
    public int deleteServers(int s_id) {
        return serversDao.deleteServers(s_id);
    }

    @Override
    public int selectCounts() {
        return serversDao.selectCounts();
    }
}
