package com.xj.study.design.decorator;

/**
 *
 *  盖伦皮肤：黄金骑士
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 14:29
 */
public class Goldenknight extends HeroSkin {


    public Goldenknight(Hero hero) {
        super(hero);
    }

    @Override
    public void color() {
        System.out.println("color : gloden");
    }

    @Override
    public void name() {
        System.out.println("name : 黄金骑士");
    }
}
