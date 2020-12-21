package com.atao.design.demo02.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author atao
 * @date 2020/12/21
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);


}
