package com.xj.study.design.chain;

/**
 * 责任链模式测试类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 17:37
 */
public class Test {
    public static void main(String[] args) {
        try {

            int i = 1 / 0;

        } catch (Exception e) {
            Proplem proplem = new Proplem(10);
            NotSupport support = new NotSupport();
            support.handleProplem(proplem);
        }
    }
}
