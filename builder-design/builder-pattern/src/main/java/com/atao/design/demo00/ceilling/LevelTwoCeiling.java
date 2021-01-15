package com.atao.design.demo00.ceilling;

import com.atao.design.demo00.Matter;

import java.math.BigDecimal;

/**
 * @Classname LevelTwoCeiling
 * @Description 吊顶 品牌；装修公司自带 型号：二级顶
 * @Date 2021/1/14 16:41
 * @Created by atao
 */
public class LevelTwoCeiling implements Matter {

    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司自带";
    }

    public String model() {
        return "二级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(850);
    }

    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }

}
