package com.atao.design.demo00.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author atao
 * @date 2020/12/18
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}
