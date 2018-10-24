package com.xj.study.design.bridge;

/**
 * 桥接模式
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:10
 */
public class Deploy {

    protected DeployImpl impl;

    public Deploy(DeployImpl impl) {
        this.impl = impl;
    }

    public final void deploy(){
        this.impl.rawOpen();
        this.impl.rawPrint();
        this.impl.rawClose();
    }
}
