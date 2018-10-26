package com.xj.study.design.visits;

/**
 * 访问者
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 16:45
 */
public interface Action {

    void visits(Man man);

    void visits(WoMan man);

    String getHandle();
}
