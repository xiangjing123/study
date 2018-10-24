package com.xj.study.design.composite;

import java.util.Map;

/**
 * 组合模式几口
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 11:11
 */
public interface Entrty {

    String getName();

    int getSize();

    Entrty add(Entrty entrty);

    void printList();

    void printList(String file);
}
