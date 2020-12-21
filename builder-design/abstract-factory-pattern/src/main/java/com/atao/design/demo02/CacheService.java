package com.atao.design.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @author atao
 * @date 2020/12/21
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
