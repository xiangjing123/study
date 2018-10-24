package com.xj.study.design.decorator;

/**
 *
 *  盖伦皮肤：赤焰骑士
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 14:29
 */
public class Redknights extends HeroSkin {


    public Redknights(Hero hero) {
        super(hero);
    }

    @Override
    public void color() {
        System.out.println("color : red");
    }

    @Override
    public void name() {
        System.out.println("name : 赤焰骑士");
    }
}
