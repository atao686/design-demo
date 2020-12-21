package com.atao.design.demo02;

import com.atao.design.demo02.store.ICommodity;
import com.atao.design.demo02.store.impl.CardCommodityService;
import com.atao.design.demo02.store.impl.CouponCommodityService;
import com.atao.design.demo02.store.impl.GoodsCommodityService;

/**
 * @author atao
 * @date 2020/12/18
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
