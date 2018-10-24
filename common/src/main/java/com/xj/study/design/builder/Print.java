package com.xj.study.design.builder;

/**
 *  打印类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:46
 */
public abstract class Print {

    public abstract void printTitle(String title);

    public abstract void printContent(String content);

    public abstract  void printFooter();
}
