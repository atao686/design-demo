package com.atao.design.demo02.factory.impl;

import com.atao.design.demo00.matter.EGM;
import com.atao.design.demo02.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author atao
 * @date 2020/12/21
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }

}
