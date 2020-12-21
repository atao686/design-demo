package com.atao.design.demo00.coupon;

/**
 * 模拟优惠券服务
 * @author atao
 * @date 2020/12/18
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + ", " + couponNumber + ", " + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
