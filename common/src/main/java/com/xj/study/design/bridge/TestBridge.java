package com.xj.study.design.bridge;

/**
 * 测试桥接模式
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:23
 */
public class TestBridge {

    public static void main(String[] args) {
        MultipleDeploy deploy = new MultipleDeploy(new StringDeployImpl());
        deploy.multipleDeploy();
    }
}
