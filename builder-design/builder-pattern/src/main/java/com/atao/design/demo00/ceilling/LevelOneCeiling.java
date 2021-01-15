package com.atao.design.demo00.ceilling;

import com.atao.design.demo00.Matter;

import java.math.BigDecimal;

/**
 * @Classname LevelOneCeiling
 * @Description 吊顶 品牌；装修公司自带 型号：一级顶
 * @Date 2021/1/14 16:39
 * @Created by atao
 */
public class LevelOneCeiling implements Matter {
    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "装修公司自带";
    }

    public String model() {
        return "一级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(260);
    }

    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
