package com.bjpowernode.service.impl;

import com.bjpowernode.dao.TotalDao;
import com.bjpowernode.domain.Totals;
import com.bjpowernode.service.TotalsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("totalsServices")
public class TotalsServicesImpl implements TotalsServices {
    @Autowired
    private TotalDao totalDao;

    @Override
    public List<Totals> findAllServers() {
        return totalDao.selectTotal();
    }
}
