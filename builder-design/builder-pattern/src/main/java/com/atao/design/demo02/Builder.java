package com.atao.design.demo02;

import com.atao.design.demo00.ceilling.LevelOneCeiling;
import com.atao.design.demo00.ceilling.LevelTwoCeiling;
import com.atao.design.demo00.coat.DuluxCoat;
import com.atao.design.demo00.coat.LiBangCoat;
import com.atao.design.demo00.floor.ShengXiangFloor;
import com.atao.design.demo00.tile.DongPengTile;
import com.atao.design.demo00.tile.MarcoPoloTile;

/**
 * @Classname Builder
 * @Description TODO
 * @Date 2021/1/15 9:48
 * @Created by atao
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

}
