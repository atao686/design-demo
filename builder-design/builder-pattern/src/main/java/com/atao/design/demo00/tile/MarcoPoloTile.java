package com.atao.design.demo00.tile;

import com.atao.design.demo00.Matter;

import java.math.BigDecimal;

/**
 * @Classname MarcoPoloTile
 * @Description 地砖 品牌；马可波罗(MARCO POLO)
 * @Date 2021/1/14 16:55
 * @Created by atao
 */
public class MarcoPoloTile implements Matter {

    public String scene() {
        return "地砖";
    }

    public String brand() {
        return "马可波罗(MARCO POLO)";
    }

    public String model() {
        return "缺省";
    }

    public BigDecimal price() {
        return new BigDecimal(140);
    }

    public String desc() {
        return "“马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }

}
