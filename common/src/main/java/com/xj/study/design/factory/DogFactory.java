package com.xj.study.design.factory;

/**
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 09:15
 */
public class DogFactory implements  Factory {
    @Override
    public Animal getFactory() {
        return new Dog();
    }
}
