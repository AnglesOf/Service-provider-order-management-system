package com.bjpowernode.service.impl;

import com.bjpowernode.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;


@Service("redisService")
public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 写入缓存
     * @param key 键
     * @param value 值
     * @return isSuccessful
     */

    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入缓存
     * @param key 键
     * @return result
     */
    public String get(final String key) {
        String result = null;
        try {
            ValueOperations operations = redisTemplate.opsForValue();
            result = (String) operations.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
