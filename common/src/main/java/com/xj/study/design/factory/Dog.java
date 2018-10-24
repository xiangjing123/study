package com.xj.study.design.factory;

/**

 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-24 09:11
 */
public class Dog implements  Animal{
    @Override
    public void printName() {
        System.out.println("my name is dog");
    }
}
