package com.atao.design.demo02.store;

import java.util.Map;

/**
 * @author atao
 * @date 2020/12/18
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
