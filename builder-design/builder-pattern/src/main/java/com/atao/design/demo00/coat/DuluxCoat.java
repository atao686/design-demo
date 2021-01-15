package com.atao.design.demo00.coat;

import com.atao.design.demo00.Matter;

import java.math.BigDecimal;

/**
 * @Classname DuluxCoat
 * @Description 涂料 品牌；多乐士(Dulux)
 * @Date 2021/1/14 16:44
 * @Created by atao
 */
public class DuluxCoat implements Matter {

    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "多乐士(Dulux)";
    }

    public String model() {
        return "第二代";
    }

    public BigDecimal price() {
        return new BigDecimal(719);
    }

    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }

}
