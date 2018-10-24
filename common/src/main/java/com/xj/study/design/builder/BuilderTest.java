package com.xj.study.design.builder;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:59
 */
public class BuilderTest {

    public static void main(String[] args) {
        TextBuilder testBuilder  = new TextBuilder(new StringPrint());
        testBuilder.printText();
    }
}
