package com.atao.design.demo02;

import com.atao.design.demo00.Matter;

/**
 * @Classname IMenu
 * @Description TODO
 * @Date 2021/1/15 9:48
 * @Created by atao
 */
public interface IMenu {

    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();

}
