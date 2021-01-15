package com.atao.design.demo00;

import java.math.BigDecimal;

/**
 * @Classname Matter
 * @Description 装修物料
 * @Date 2021/1/14 16:37
 * @Created by atao
 */
public interface Matter {

    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();

}
