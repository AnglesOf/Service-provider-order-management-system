package com.bjpowernode.dao;

import com.bjpowernode.domain.Totals;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TotalDao {
    List<Totals> selectTotal();
}
