package com.atao.design.demo01;

import java.util.concurrent.TimeUnit;

/**
 * @author atao
 * @date 2020/12/21
 */
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);

}
