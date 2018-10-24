package com.xj.study.design.decorator;

/**
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 14:33
 */
public class Test {

    public static void main(String[] args) {
        Hero hero  = new GaiLun();
        Goldenknight goldenknight = new Goldenknight(hero);
        goldenknight.getHeroName();
    }
}
