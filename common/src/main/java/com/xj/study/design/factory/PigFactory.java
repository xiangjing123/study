package com.xj.study.design.factory;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 09:14
 */
public class PigFactory implements Factory{
    @Override
    public Animal getFactory() {
        return new Pig();
    }
}
