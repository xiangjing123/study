package com.xj.study.design.decorator;

/**
 * 英雄皮肤
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 14:27
 */
public abstract class HeroSkin implements Hero {

    private Hero hero;

    public HeroSkin(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getHeroName() {

        System.out.println("英雄："+hero.getHeroName());
        System.out.println("皮肤：");
        color();
        name();
        return hero.getHeroName();
    }

    public abstract void color();

    public abstract void name();
}
