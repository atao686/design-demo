package com.atao.design;

import com.atao.design.demo02.CacheService;
import com.atao.design.demo02.factory.impl.EGMCacheAdapter;
import com.atao.design.demo02.factory.impl.IIRCacheAdapter;
import com.atao.design.demo02.impl.CacheServiceImpl;
import com.atao.design.demo02.factory.JDKProxy;
import org.junit.Test;

/**
 * @author atao
 * @date 2020/12/21
 */
public class PatternApiTest {

    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "阿涛");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "阿涛");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }

}
