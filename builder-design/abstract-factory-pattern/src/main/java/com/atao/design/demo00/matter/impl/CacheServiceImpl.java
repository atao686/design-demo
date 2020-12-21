package com.atao.design.demo00.matter.impl;

import com.atao.design.demo00.CacheService;
import com.atao.design.demo00.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author atao
 * @date 2020/12/21
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }

}
