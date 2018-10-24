package com.xj.study.design.bridge;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:19
 */
public class StringDeployImpl extends  DeployImpl {

    @Override
    public void rawOpen() {
        System.out.println("字符串实现开始");
    }

    @Override
    public void rawPrint() {
        System.out.println("hello world!");
    }

    @Override
    public void rawClose() {
        System.out.println("字符串实现结束");
    }
}
