package com.xj.study.design.factory;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 09:16
 */
public class FactoryTest {

    public static void main(String[] args) {
        Animal animal = new PigFactory().getFactory();
        animal.printName();
    }
}
