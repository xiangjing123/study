package com.xj.study.design.visits;

/**
 *  访问者元素类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 16:44
 */
public abstract class People {

    public abstract String getName();

    public abstract void accept(Action action);
}
