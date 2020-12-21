package com.atao.design;

import com.atao.design.demo01.CacheService;
import com.atao.design.demo01.impl.CacheServiceImpl;
import com.atao.design.demo02.factory.JDKProxy;
import org.junit.Test;

/**
 * @author atao
 * @date 2020/12/21
 */
public class NoPatternApiTest {

    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "阿涛", 2);
        String val01 = cacheService.get("user_name_01", 2);
        System.out.println("测试结果：" + val01);

    }

}
