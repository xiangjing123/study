package com.xj.study.design.bridge;

/**
 *  桥接功能模式结构
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:10
 */
public abstract class DeployImpl {

    public abstract  void rawOpen();

    public abstract  void rawPrint();

    public abstract  void rawClose();
}
