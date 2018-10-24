package com.xj.study.design.bridge;

/**
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-23 16:21
 */
public class MultipleDeploy extends Deploy {

    public MultipleDeploy(DeployImpl impl) {
        super(impl);
    }

    /**
     * 添加的功能
     */
    public final void multipleDeploy() {
        this.impl.rawOpen();
        for (int i = 0; i < 3; i++) {
            this.impl.rawPrint();
        }
        this.impl.rawClose();
    }
}
