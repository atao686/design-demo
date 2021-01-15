package com.atao.design.demo00.floor;

import com.atao.design.demo00.Matter;

import java.math.BigDecimal;

/**
 * @Classname ShengXiangFloor
 * @Description 地板 品牌：圣象
 * @Date 2021/1/14 16:54
 * @Created by atao
 */
public class ShengXiangFloor implements Matter {

    public String scene() {
        return "地板";
    }

    public String brand() {
        return "圣象";
    }

    public String model() {
        return "一级";
    }

    public BigDecimal price() {
        return new BigDecimal(318);
    }

    public String desc() {
        return "圣象地板是中国地板行业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }

}
