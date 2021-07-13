package com.bjpowernode.service;

public interface RedisService {
    boolean set(final String key, Object value);
    String get(final String key);
}
